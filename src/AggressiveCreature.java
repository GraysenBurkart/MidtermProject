import java.util.Random;

public abstract class AggressiveCreature extends Creature{
    protected int health;
    protected int attackPoints;

    // aggressive creature construct
    AggressiveCreature (String name){
        super(name);
//        health = 100;
//        attackPoints = 15;
    }

    /**
     * rolls random number for attack
     * deducts attack from target's health
     * @param target Player
     * @return new target health
     */
    public int attack(Player target){
        Random random = new Random();
        int damageRoll = random.nextInt(1, this.attackPoints+1);
        System.out.printf("%s did %d damage to %s%n", this.name, damageRoll , target.name);
        target.health -= damageRoll;
        System.out.printf("%s has %d health left.%n", target.name, target.health);
        return target.health;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

}
