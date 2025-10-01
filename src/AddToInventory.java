public interface AddToInventory {

    public default void addToInventory(){
        System.out.println("You have added an item to your inventory.");
    }

}
