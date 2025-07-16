import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Spaceship {
    private int x;
    private int y;

    public Spaceship() {
        this.x = 0;
        this.y = 0;
    }

    public void move(int dx, int dy, int gridSize) {
        int newX = x + dx;
        int newY = y + dy;

        if (newX >= 0 && newX < gridSize && newY >= 0 && newY < gridSize) {
            x = newX;
            y = newY;
        } else {
            System.out.println("Move out of bounds!");
        }
    }
}
