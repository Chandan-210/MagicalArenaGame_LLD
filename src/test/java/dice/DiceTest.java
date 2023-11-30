package dice;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class DiceTest {
    @Test
    public void testDiceRoll(){
        // Use the same input method as in the main function
        Dice dice = new Dice();
        int rollResult = dice.roll();

        assertTrue(rollResult >= 1 && rollResult <= 6);
    }
}
