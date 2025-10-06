import java.util.Random;

public class Wyvern extends AggressiveCreature{
    protected String claw;
    protected String tooth;
    protected int quickAttack;

    Wyvern(String name){
        super(name);
        health = 100;
        attackPoints = 15;
        quickAttack = 10;
        claw = "Wyvern Claw";
        tooth = "Wyvern Tooth";
    }

    /**
     * Rolls for attack with lower bound
     * @param target Player
     * @return new target health
     */
    public int specialQuickAttack(Player target){
        Random random = new Random();
        int damageRoll = random.nextInt(1, this.quickAttack+1);
        System.out.printf("%s did %d damage to %s%n", this.name, damageRoll , target.name);
        target.health -= damageRoll;
        System.out.printf("%s has %d health left.%n", target.name, target.health);
        return target.health;
    }

    /**
     * Adds Wyvern claw and tooth to inventory
     */
    public void dropItems(){
        Player.pouch.add(claw);
        System.out.println("A Wyvern Claw has been added to you pouch.");
        Player.pouch.add(tooth);
        System.out.println("A Wyvern Tooth has been added to you pouch.");
    }

}
