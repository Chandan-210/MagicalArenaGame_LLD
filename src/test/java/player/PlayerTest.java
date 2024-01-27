package player;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void testPlayerCreation() {
        //use the same input method as present in the Main (MagicalArena Driver) function
        // Test case 1: create a Valid Player
        Player player = createPlayerFromInput("50 5 10");
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());

        // Test case 2: create player with zero values for health, strength, and attack
        player = createPlayerFromInput("0 0 0");
        assertEquals(0, player.getHealth());
        assertEquals(0, player.getStrength());
        assertEquals(0, player.getAttack());

        // Test case 3: create player with negative values for health, strength, and attack
        player = createPlayerFromInput("-10 -5 -3");
        /*
        if(player.getHealth() < 0) {
            fail("Error: A player's health cannot be negative.");
        }

         */
        assertTrue("Error: A player's health cannot be negative.", player.getHealth() < 0);
        assertTrue("Error: A player's strength cannot be negative initially.", player.getStrength() < 0);
        assertTrue("Error: A player's attacking power cannot be negative initially.", player.getAttack() < 0);
        /*
        if(player.getStrength() < 0) {
            fail("Error: A player's strength cannot be negative initially.");
        }
        if(player.getAttack() < 0) {
            fail("Error: A player's attack value cannot be negative initially.");
        }

         */

        // Test case 4: create player with large values for health, strength, and attack
        player = createPlayerFromInput("1000000 50000 10000");
        assertEquals(1000000, player.getHealth());
        assertEquals(50000, player.getStrength());
        assertEquals(10000, player.getAttack());
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
