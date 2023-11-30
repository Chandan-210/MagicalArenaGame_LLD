package player;
import java.util.Scanner;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack){
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int setHealth(){
        return this.health;
    }
    public int setStrength(){
        this.strength = strength;
    }
    public int setAttack(){
        this.attack = attack;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public int getAttack(){
        return attack;
    }
    public void reduceHealth(int damage){
        health -= damage;
        if(health < 0){
            health = 0;
        }
    }
    // Method to create a Player instance with user-defined input
    public static Player createPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter health: ");
        int health = scanner.nextInt();

        System.out.print("Enter strength: ");
        int strength = scanner.nextInt();

        System.out.print("Enter attack: ");
        int attack = scanner.nextInt();

        scanner.close();

        return new Player(health, strength, attack);
    }
}
