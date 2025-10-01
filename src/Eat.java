public interface Eat {

    /**
     * adds items health to player's health
     * @param player
     * @return new player health
     */
    public default int eat(Player player){
        int health = 100;
        System.out.println("Health has been added.");
        return health;
    }
}
