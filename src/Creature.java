public abstract class Creature {

    protected String name;

    // general creature construct
    Creature (String name){
        this.name = name;
    }

    /**
     * displays creature
     */
    public void display(){
        System.out.printf("You spot a %s!%n", name);
    }

}
