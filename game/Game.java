import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Game {

    public static void main(String[] args) {
        World world = new World(20, 10);
        Character player = new Character("Raimo", CharacterType.PLAYER, "X");
        Character enemy = new Character("Sipsik", CharacterType.MONSTER, "o");
        Character npc = new Character("Helper", CharacterType.NPC, "N");

        world.addCharacters(Arrays.asList(
            enemy, 
            npc, 
            player
        ));

        Scanner scanner = new Scanner(System.in);

        String input = "";

        world.render();
        while(!input.equals("end")){
            input = scanner.nextLine();

            if (input.equals("")){
                player.move();
            } else if (input.equals("u")){
                player.changeDirection(Direction.UP);
            } else if (input.equals("d")){
                player.changeDirection(Direction.DOWN);
            } else if (input.equals("l")){
                player.changeDirection(Direction.LEFT);
            } else if (input.equals("r")){
                player.changeDirection(Direction.RIGHT);
            }

            if(player.x == enemy.x && player.y == enemy.y){
                System.out.println("Yay!");
            }
        }

    }
}