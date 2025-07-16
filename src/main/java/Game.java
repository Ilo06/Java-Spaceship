import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        int maxMoves = 20;
        int score = 0;
        int moves = 0;

        Grid grid = new Grid(size, new String[size][size], 10);
        grid.drawGrid();
        grid.placeJunk();

        Spaceship spaceship = new Spaceship();
        grid.drawSpaceship(spaceship);
        grid.showGrid();

        while (moves < maxMoves) {
            System.out.print("Command (z/q/s/d = move, quit = quit): ");
            String command = scanner.nextLine();

            switch (command) {
                case "z": spaceship.move(0, -1, size); break;
                case "s": spaceship.move(0, 1, size); break;
                case "q": spaceship.move(-1, 0, size); break;
                case "d": spaceship.move(1, 0, size); break;
                case "quit":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Unknown command.");
                    continue;
            }

            String cell = grid.getGrid()[spaceship.getY()][spaceship.getX()];
            if (cell.equals(" J ")) {
                score++;
                grid.getGrid()[spaceship.getY()][spaceship.getX()] = " . ";
                System.out.println("Collision! Junk ! Score: " + score);
            }

            grid.drawSpaceship(spaceship);
            grid.showGrid();

            moves++;
            System.out.println("Score: " + score + " | Moves left: " + (maxMoves - moves));

            if (!hasJunk(grid)) {
                System.out.println("Bravo You win !");
                break;
            }
        }

        System.out.println("Game Over! Final score: " + score);
    }

    private static boolean hasJunk(Grid grid) {
        String[][] g = grid.getGrid();
        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                if (g[i][j].equals(" J ")) {
                    return true;
                }
            }
        }
        return false;
    }
}
