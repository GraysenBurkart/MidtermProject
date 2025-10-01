public class Newt extends PassiveCreature {
    protected String eye;
    //protected boolean caught;

    Newt (String name){
        super (name);
        luck = 3;
        eye = "Eye of Newt";
    }

    /**
     * if caught
     * adds Eye of Newt to inventory
     */
    public void dropEye(){
        if (caught) {
            Player.pouch.add(eye);
        }
    }

}
