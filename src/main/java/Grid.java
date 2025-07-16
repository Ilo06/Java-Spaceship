import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Grid {
    private static int size;
    private String[][] grid;
    private int junkNumbers;

    public void drawGrid(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = " . ";
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static int getRandomInt() {
        return (int) (Math.random() * size + 1);
    }

    public void placeJunk() {
        for (int i = 0; i < junkNumbers; i++) {
            grid[getRandomInt()][getRandomInt()] = " J ";
        }
    }

    public static void main(String[] args) {
        Grid grid = new Grid( new String[10][10], 10);
        grid.placeJunk();
        grid.drawGrid(10);
    }

}
