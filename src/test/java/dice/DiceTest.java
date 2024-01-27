package dice;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
public class DiceTest {
    @Test
    public void testDiceRoll() {
        // Use the same input method as in the main function
        Dice dice = new Dice();
        int rollResult;
        //Test case 1: roll the dice 1 time
        rollResult = dice.roll();
        assertTrue(rollResult >= 1 && rollResult <= 6);
    }
    @Test
    public void testDiceRollMultiple() {
        Dice dice = new Dice();
        int rollResult;

        //Test case 2: roll the dice multiple times eg. 1000
        for (int i = 0; i < 1000; i++) {
            rollResult = dice.roll();
            assertTrue("Dice Roll result should be between 1 and 6", rollResult >= 1 && rollResult <= 6);
        }
    }
    @Test
    public void testDiceRollRandomness(){
        Dice dice = new Dice();
        int rollResult;

        //Test case 3: tertiary test case to check if 2 consecutive dice rolls produce the same result
        rollResult = dice.roll();
        int rollResult1 = dice.roll();
        assertNotEquals("Two consecutive dice rolls should not be equal, to ensure randomness.", rollResult, rollResult1);
    }
}
