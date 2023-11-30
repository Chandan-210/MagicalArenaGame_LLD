package arena;
import player.Player;
import dice.Dice;
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

    public ArenaSimulationResult startMatch() {
        Dice dice = new Dice();
        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            // Player A's turn
            int attackRollA = dice.roll();
            int damageA = playerA.getAttack() * attackRollA;

            // Player B's defense
            int defenseRollB = dice.roll();
            int defenseB = playerB.getStrength() * defenseRollB;

            // Calculate damage dealt by A after defense
            int actualDamageA = Math.max(0, damageA - defenseB);
            playerB.reduceHealth(actualDamageA);

            // Check if Player B is defeated
            if (playerB.getHealth() == 0) {
                return new ArenaSimulationResult(false);
            }

            // Player B's turn
            int attackRollB = dice.roll();
            int damageB = playerB.getAttack() * attackRollB;

            // Player A's defense
            int defenseRollA = dice.roll();
            int defenseA = playerA.getStrength() * defenseRollA;

            // Calculate damage dealt by B after defense
            int actualDamageB = Math.max(0, damageB - defenseA);
            playerA.reduceHealth(actualDamageB);

            // Check if Player A is defeated
            if (playerA.getHealth() == 0) {
                return new ArenaSimulationResult(false);
            }
        }

        // The match is concluded
        return new ArenaSimulationResult(true);
    }

}
