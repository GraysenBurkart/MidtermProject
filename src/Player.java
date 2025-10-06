import java.util.ArrayList;
import java.util.Random;

public class Player {

    protected String name;
    protected int health;
    protected String location;
    protected int attackPoints;
    private int dodge;
    public static ArrayList<String> pouch = new ArrayList<String>();

    Player(String name){
        this.name = name;
        health = 100;
        location = "Starting Clearing";
        attackPoints = 10;
        dodge = 10;
    }

    // check player stats
    public void sayHi(){
        System.out.printf("%s has %d health and is in %s.%n", name, health, location);
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
        int dodgeRoll = random.nextInt(1, dodge);
        if (dodgeRoll == dodge){
            target.attackPoints = 0;
        }
    }

    /**
     * if player has fae dust in pouch,
     * can select item to alter play stats and add health
     * @param item from pouch
     */
    public void craft(String item){
        if (pouch.contains("Fae Dust")){
            if (item.equals("Eye of Newt") && pouch.contains("Eye of Newt")){
                dodge -= 1;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("You feel like you can see better and can now dodge attacks easier.");
            } else if (item.equals("Rabbit's Foot") && pouch.contains("Rabbit's Foot")) {
                dodge -= 1;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("You feel lighter on your feet and can dodge a bit better now.");
            } else if (item.equals("Lucky Rabbit's Foot") && pouch.contains("Lucky Rabbit's Foot")){
                dodge -= 2;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("You feel lighter on your feet and can dodge attacks a bit better now.");
            } else if (item.equals("Mushroom") && pouch.contains("Mushroom")){
                health += 30;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("This mushroom tastes so good I can feel my health increase!");
            } else if (item.equals("Herb") && pouch.contains("Herb")){
                health += 15;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("This herb is so nice I can feel my health increase!");
            } else if (item.equals("Minotaur Horn") && pouch.contains("Minotaur Horn")){
                attackPoints += 10;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("This Minotaur horn will coming handy and increase my attack.");
            } else if (item.equals("Wyvern Claw") && pouch.contains("Wyvern Claw")){
                attackPoints += 5;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("This Wyvern claw will be useful in a fight. My attack increases a bit.");
            } else if (item.equals("Wyvern Tooth") && pouch.contains("Wyvern Tooth")){
                attackPoints += 3;
                pouch.remove(item);
                pouch.remove("Fae Dust");
                System.out.println("This Wyvern tooth will come in handy and increases my attack a little.");
            }
        } else {
            System.out.println("You need fae dust to craft.");
        }
    }

}
