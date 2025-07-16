import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Grid {
    private int size;

    public void drawGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" . ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Grid grid = new Grid(10);
        grid.drawGrid();
    }

}
