import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Room startingClearing = new Room("Starting Clearing");
        startingClearing.description = "You find yourself in a forest clearing.";
        Room forestClearing = new Room("Forest Clearing");
        forestClearing.description = "It's a forest clearing.";
        Room meadowClearing = new Room("Meadow Clearing");
        meadowClearing.description = "It's a meadow with little wild flowers and tall grass.";
        Room rockyClearing = new Room("Rocky Clearing");
        rockyClearing.description = "A clearing surrounded by tall rocks";
        Room windyClearing = new Room("Windy Clearing");
        windyClearing.description = "The wind in this clearing is particularly strong. The wind is kicking up a lot of dust.";

        Room goodPath = new Room("Good Path");
        goodPath.description = "This path has a bright warm light.";
        Room badPath = new Room("Bad Path");
        Room forestPath = new Room("Forest Path");
        Room thickForestPath = new Room("Thick Forest Path");
        Room meadowPath = new Room("Meadow Path");
        Room bendyPath = new Room("Bendy Path");
        Room rockyPath = new Room("Rocky Path");
        Room windyPath = new Room("Windy Path");
        Room steepPath = new Room("Steep Path");
        Room acornPath = new Room("Acorn Path");
        Room flowerPath = new Room("Flower Path");
        Room darkPath = new Room("Dark Path");

        // starting clearing connections
        ArrayList<Room> connections1 = new ArrayList<>();
        connections1.add(forestPath);
        connections1.add(meadowPath);
        startingClearing.setConnectedRooms(connections1);

        // forest path connections
        ArrayList<Room> connections2 = new ArrayList<>();
        connections2.add(forestClearing);
        connections2.add(thickForestPath);
        forestPath.setConnectedRooms(connections2);

        // meadow path connections
        ArrayList<Room> connections3 = new ArrayList<>();
        connections3.add(meadowClearing);
        connections3.add(bendyPath);
        meadowPath.setConnectedRooms(connections3);

        // forest clearing connections
        ArrayList<Room> connections4 = new ArrayList<>();
        connections4.add(forestPath);
        connections4.add(thickForestPath);
        connections4.add(acornPath);
        forestClearing.setConnectedRooms(connections4);

        // meadow clearing connections
        ArrayList<Room> connections5 = new ArrayList<>();
        connections5.add(meadowPath);
        connections5.add(flowerPath);
        connections5.add(windyPath);
        meadowClearing.setConnectedRooms(connections5);

        // rocky clearing connections
        ArrayList<Room> connections6 = new ArrayList<>();
        connections6.add(rockyPath);
        connections6.add(steepPath);
        rockyClearing.setConnectedRooms(connections6);

        // windy clearing connections
        ArrayList<Room> connections7 = new ArrayList<>();
        connections7.add(windyPath);
        connections7.add(bendyPath);
        windyClearing.setConnectedRooms(connections7);

        // thick forest path connections
        ArrayList<Room> connections8 =new ArrayList<>();
        connections8.add(forestClearing);
        connections8.add(darkPath);
        connections8.add(acornPath);
        thickForestPath.setConnectedRooms(connections8);

        // bendy path connections
        ArrayList<Room> connections9 = new ArrayList<>();
        connections9.add(meadowPath);
        connections9.add(windyClearing);
        connections9.add(rockyPath);
        bendyPath.setConnectedRooms(connections9);

        // rocky path connections
        ArrayList<Room> connections10 = new ArrayList<>();
        connections10.add(rockyClearing);
        connections10.add(bendyPath);
        rockyPath.setConnectedRooms(connections10);

        // windy path connections
        ArrayList<Room> connections11 = new ArrayList<>();
        connections11.add(windyClearing);
        connections11.add(meadowClearing);
        windyPath.setConnectedRooms(connections11);

        // steep path connections
        ArrayList<Room> connections12 = new ArrayList<>();
        connections12.add(flowerPath);
        steepPath.setConnectedRooms(connections12);

        // flower path connections
        ArrayList<Room> connections13 = new ArrayList<>();
        connections13.add(goodPath);
        connections13.add(meadowPath);
        flowerPath.setConnectedRooms(connections13);

        // dark path connections
        ArrayList<Room> connections14 = new ArrayList<>();
        connections14.add(badPath);
        connections14.add(thickForestPath);
        darkPath.setConnectedRooms(connections14);


        int currentLocation;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello adventurer! What is your name?");
        String userName = userInput.nextLine();

        Player player = new Player(userName);


        while (player.health > 0){
            player.sayHi();
            System.out.printf("Please use the numbers on your keyboard to choose your path.%n%n");


        }

    }
}
