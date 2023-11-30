package player;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
public class PlayerTest {
    @Test
    public void testPlayerCreation() {
        //use the same input method as present in the Main (MagicalArena Driver) function
        Player player = createPlayerFromInput("50 5 10");
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }
    // helper method to create a Player instance from user-provided input
    private Player createPlayerFromInput(String input) {
        Scanner scanner = new Scanner(input);
        int health = scanner.nextInt();
        int strength = scanner.nextInt();
        int attack = scanner.nextInt();
        scanner.close();
        return new Player(health, strength, attack);
    }
}
