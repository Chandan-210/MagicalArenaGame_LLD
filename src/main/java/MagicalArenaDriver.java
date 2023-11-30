import player.Player;
import arena.MagicalArena;
import arena.ArenaSimulationResult;
//import java.util.Scanner;
public class MagicalArenaDriver {
    public static void main(String[] args){
        //enter Scanner object input stream
        //Scanner scanner  = new Scanner(System.in);

        //Enter input/ details for PLayer A
        System.out.println("Welcome: Player A");
        System.out.println("Enter your attributes");
        Player playerA = player.Player.createPlayer();

        //Enter input/ details for PLayer B
        System.out.println("Welcome: Player B");
        System.out.println("Enter your attributes");
        Player playerB = player.Player.createPlayer();

        //put both these players (attributes already entered) into the MagicalArena
        MagicalArena magicalArena = new MagicalArena(playerA, playerB);
        //start the game in the arena as per the rules
        ArenaSimulationResult result = magicalArena.startMatch();

        // Display match result
        if (result.isMatchInProgress()) {
            System.out.println("\nThe match is still in progress.");
        } else {
            System.out.println("\nThe match has concluded.");
            System.out.println("Player A's final health: " + playerA.getHealth());
            System.out.println("Player B's final health: " + playerB.getHealth());

            // Further actions based on the result
            //Get winner information and print player details
            if (playerA.getHealth() > playerB.getHealth()) {
                System.out.println("Player A won!");
                System.out.println("Player B lost!");
            } else if (playerB.getHealth() > playerA.getHealth()) {
                System.out.println("Player B won!");
                System.out.println("Player A lost!");
            } else {
                System.out.println("It's a draw between Player A and Player B!");
            }
        }
    }
}
