public class Sprite extends PassiveCreature{
    String faeDust;

    Sprite(String name){
        super(name);
        luck = 2;
        faeDust = "Fae Dust";
    }

    /**
     * if caught
     * adds Fae Dust to inventory
     */
    public void dropFaeDust(){
        if (caught) {
            Player.pouch.add(faeDust);
        }
    }
}
