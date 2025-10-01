public class Herb implements Eat, AddToInventory{

    String name;
    int health;

    Herb (){
        name = "Herb";
        health = 10;
    }

    public void display(){
        System.out.println("You spot a herb!");
    }

    /**
     * adds items health to player's health
     * @param player
     * @return new player health
     */
    @Override
    public int eat(Player player){
        System.out.printf("You have gained %d health.%n", health);
        player.health += health;
        System.out.printf("Your health is now %d.%n", player.health);
        return player.health;
    }

    /**
     * adds item to player inventory
     */
    @Override
    public void addToInventory(){
        Player.pouch.add(name);
    }
}
