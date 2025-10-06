import java.util.Random;

public class Rabbit extends PassiveCreature {
    protected String rabbitFoot;
    protected String luckyFoot;


    Rabbit(String name) {
        super(name);
        luck = 3;
        rabbitFoot = "Rabbit's Foot";
        luckyFoot = "Lucky Rabbit's Foot";
    }

    /**
     * if rabbit is caught, drops rabbit foot
     * rolls for foot luck
     * if foot is lucky, drops luck rabbit foot instead
     */
    public void dropRabbitFoot() {
        if (caught) {
            Random random = new Random();
            int footLuck = random.nextInt(1, 2);
            if (footLuck == 1) {
                Player.pouch.add(rabbitFoot);
                System.out.println("A Rabbit's Foot has been added to you pouch.");
            } else if (footLuck == 2) {
                Player.pouch.add(luckyFoot);
                System.out.println("A Lucky Rabbit's Foot has been added to you pouch.");
            }
        }
    }
}