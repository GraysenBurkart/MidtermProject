public class Main {
    public static void main(String[] args){
    System.out.println("Midterm");

    Newt newt = new Newt("newt");
    Player player = new Player("Gray");
    Minotaur minotaur1 = new Minotaur("Minotaur");
    Minotaur minotaur2 = new Minotaur("Minotaur");

    newt.display();
    newt.escape();

//    minotaur1.display();
//    minotaur2.display();

    newt.display();
    newt.escape();
    newt.dropEye();
    player.viewInventory();

    }
}
