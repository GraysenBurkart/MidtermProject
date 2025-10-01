import java.util.ArrayList;
import java.util.Random;

public class Player {

    protected String name;
    protected int health;
    protected int attackPoints;
    private int dodge;
    public static ArrayList<String> pouch = new ArrayList<String>();

    Player(String name){
        this.name = name;
        health = 100;
        attackPoints = 10;
        dodge = 2;
    }

    public void sayHi(){
        System.out.printf("%s has %d health!%n", name, health);
    }

    //getter methods
    public void viewInventory(){
        System.out.println(pouch);
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public int getAttack(){
        return this.attackPoints;
    }

    /**
     * rolls random number for attack
     * @param target Aggressive Creature
     * @return new target health
     */
    public int attack(AggressiveCreature target){
        Random random = new Random();
        int damageRoll = random.nextInt(1, this.attackPoints+1);
        System.out.printf("%s did %d damage to %s%n", this.name, damageRoll , target.name);
        target.health -= damageRoll;
        System.out.printf("%s has %d health left.%n", target.name, target.health);
        return target.health;
    }

    /**
     * Rolls for dodge
     * if dodge is successful, attack is negated
     * @param target Aggressive Creature
     */
    public void dodgeAttack(AggressiveCreature target){
        Random random = new Random();
        int dodgeRoll = random.nextInt(1, this.dodge);
        if (dodgeRoll == 2){
            target.attackPoints = 0;
        }
    }

}
