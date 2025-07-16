import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    public void drawSpaceship(Spaceship spaceship) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j].equals(" S ")) {
                    grid[i][j] = " . ";
                }
            }
        }

        grid[spaceship.getY()][spaceship.getX()] = " S ";
    }

    public void showGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    private int getRandomInt() {
        return (int) (Math.random() * size);
    }
}
