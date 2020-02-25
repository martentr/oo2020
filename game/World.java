/**
 * World
 */
public class World {

    private int width;
    private int height;

    public World(int width, int height){
        this.width = width;
        this.height = height;
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

                System.out.print(symbol);
            }

            System.out.println("");
            symbol = "";
        }
    }
}