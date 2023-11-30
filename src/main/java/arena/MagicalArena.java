package arena;
import player.Player;
import java.util.Random;
public class MagicalArena {
    private final Player playerA;
    private final Player playerB;
    private final Random random;

    public MagicalArena(Player playerA, Player playerB){
        this.playerA = playerA;
        this.playerB = playerB;
        this.random = new Random();
    }

}
