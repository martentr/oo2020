import java.util.List;

/**
 * World
 */
public class World {

    private int width;
    private int height;
    List<Character> characters;

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }

    void addCharacters(List<Character> c){
        this.characters = c;
    }

    void render(){
        String symbol = "";

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                if (y == 0 || y == height-1){
                    symbol = "-";
                } else if (x == 0 || x == width-1){
                    symbol = "|";
                } else {
                    symbol = " ";
                }

                for (Character c : characters){
                    if (c.isVisible && c.x == x && c.y == y){
                        symbol = c.getSymbol();
                    }
                }

                System.out.print(symbol);
            }

            System.out.println("");
            symbol = "";
        }
    }
}