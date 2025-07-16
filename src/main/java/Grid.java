import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Grid {
    private int size;
    private String[][] grid;
    private int junkNumbers;

    public void drawGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = " . ";
            }
        }
    }

    public void showGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public int getRandomInt() {
        return (int) (Math.random() * size);
    }

    public void placeJunk() {
        int placed = 0;
        while (placed < junkNumbers) {
            int row = getRandomInt();
            int col = getRandomInt();
            if (grid[row][col].equals(" . ")) {
                grid[row][col] = " J ";
                placed++;
            }
        }
    }

    public static void main(String[] args) {
        int size = 10;
        int junk = 10;
        Grid grid = new Grid(size, new String[size][size], junk);
        grid.drawGrid();
        grid.placeJunk();
        grid.showGrid();
    }
}
