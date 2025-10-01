import java.util.Random;

public class Minotaur extends AggressiveCreature{
    protected String horn;
    protected int heavyAttack;

    Minotaur(String name){
        super(name);
        health = 100;
        attackPoints = 20;
        horn = "Minotaur Horn";
        heavyAttack = 30;
    }

    /**
     * special attack with higher attack bound
     * @param target Player
     * @return new target health
     */
    public int specialHeavyAttack(Player target){
        Random random = new Random();
        int damageRoll = random.nextInt(1, this.heavyAttack+1);
        System.out.printf("%s did %d damage to %s%n", this.name, damageRoll , target.name);
        target.health -= damageRoll;
        System.out.printf("%s has %d health left.%n", target.name, target.health);
        return target.health;
    }

    public void dropHorn(){
        Player.pouch.add(horn);
    }

}
