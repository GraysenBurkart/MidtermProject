import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello adventurer! What is your name?");
        String userName = userInput.nextLine();

        Player player = new Player(userName);

        player.sayHi();

    }
}
