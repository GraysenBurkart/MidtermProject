public abstract class PassiveCreature extends Creature {
    protected int luck;
    boolean caught;

    PassiveCreature (String name){
        super(name);
    }

    /**
     * Rolls random number,if number matches luck
     * creature is caught, else creature escapes
     */
    public boolean escape(){
        int escapeChance = ((int)(Math.random() * luck) + 1);
        //System.out.println(escapeChance);
        if (escapeChance == luck){
            System.out.printf("You caught the %s!%n", name);
            return caught = true;
        }else{
            System.out.printf("The %s has escaped!%n", name);
            return caught = false;
        }
    }

}
