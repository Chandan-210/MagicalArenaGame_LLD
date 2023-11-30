package dice;
import java.util.Random;
public class Dice {
    private Random random;
    public Dice(){
        this.random = new Random();
    }
    public int roll(){
        //since the dice is a 6-sided object
        return random.nextInt(6) + 1;
    }
}
