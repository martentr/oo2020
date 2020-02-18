import java.util.Scanner;

/**
 * Main
 */
public class Game {

    public static void main(String[] args) {
        Character player = new Character("Raimo", CharacterType.WARRIOR);
        Character enemy = new Character("Sipsik", CharacterType.WIZARD);

        Scanner scanner = new Scanner(System.in);

        player.slogan = "Hey";

        player.move();
        player.changeDirection(Direction.RIGHT);

        player.move();
        player.move();
        player.move();
        player.move();
        player.move();
        enemy.move();

        String input = "";

        while(!input.equals("end")){
            input = scanner.nextLine();

            if (input.equals("")){
                player.move();
            } else if (input.equals("u")){
                player.changeDirection(Direction.UP);
                player.move();
            } else if (input.equals("d")){
                player.changeDirection(Direction.DOWN);
                player.move();
            } else if (input.equals("l")){
                player.changeDirection(Direction.LEFT);
                player.move();
            } else if (input.equals("r")){
                player.changeDirection(Direction.RIGHT);
                player.move();
            }

            if(player.x == enemy.x && player.y == enemy.y){
                System.out.println("Yay!");
            }
        }

    }
}