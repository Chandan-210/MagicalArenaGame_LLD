package arena;
import org.junit.Test;
import player.Player;
import java.util.Scanner;
import static org.junit.Assert.assertFalse;
public class MagicalArenaTest {
    @Test
    public void testMatchResult() {
        // Use the same input method as in the main function
        Player playerA = createPlayerFromInput("50 5 10");
        Player playerB = createPlayerFromInput("100 10 5");

        MagicalArena arena = new MagicalArena(playerA, playerB);
        ArenaSimulationResult result = arena.startMatch();

        assertFalse(result.isMatchInProgress());
    }
}
