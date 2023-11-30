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


    }
}
