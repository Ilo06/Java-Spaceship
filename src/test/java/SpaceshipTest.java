import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpaceshipTest {

    @Test
    public void testMoveWithinBounds() {
        Spaceship ship = new Spaceship();
        ship.move(2, 2, 10);
        assertEquals(2, ship.getX());
        assertEquals(2, ship.getY());
    }

    @Test
    public void testMoveOutOfBounds() {
        Spaceship ship = new Spaceship();
        ship.move(-1, 0, 10);
        assertEquals(0, ship.getX());
        assertEquals(0, ship.getY());
    }
}
