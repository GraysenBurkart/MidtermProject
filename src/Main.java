import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

  static boolean move;

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
        badPath.description = "This is a dark path that seems to stretch on and on and on" +
                "You are now trapped in the darkness with no hope of escape.";
        Room forestPath = new Room("Forest Path");
        forestPath.description = "There are a lot of trees but a clear path. " +
                "The way the light shines through the branches is really pretty.";
        Room thickForestPath = new Room("Thick Forest Path");
        thickForestPath.description = "The trees are so thick here. You can just barely see the path forward.";
        Room meadowPath = new Room("Meadow Path");
        meadowPath.description = "The grass here is tall and dotted with little wild flowers.";
        Room bendyPath = new Room("Bendy Path");
        bendyPath.description = "The path twists and bends a lot.";
        Room rockyPath = new Room("Rocky Path");
        rockyPath.description = "This way is surrounded by large rocks of all shapes.";
        Room windyPath = new Room("Windy Path");
        windyPath.description = "The wind is so strong here it feels like it's pulling you forward.";
        Room steepPath = new Room("Steep Path");
        steepPath.description = "You slide down the path trying not to tumble down. " +
                "As you look up you see you can not climb back up.";
        Room acornPath = new Room("Acorn Path");
        acornPath.description = "Surrounded by oak trees, you see many acrons on the path. " +
                "Be careful not to slip on all the acrons.";
        Room flowerPath = new Room("Flower Path");
        flowerPath.description = "There are flowers everywhere, rose, tulips, lavender and more.";
        Room darkPath = new Room("Dark Path");
        darkPath.description = "It's inexplicably dark here, you can only see a few inches in front of you.";

        // starting clearing connections
        ArrayList<Room> connections1 = new ArrayList<Room>();
        connections1.add(forestPath);
        connections1.add(meadowPath);
        startingClearing.setConnectedRooms(connections1);

        // forest path connections
        ArrayList<Room> connections2 = new ArrayList<Room>();
        connections2.add(forestClearing);
        connections2.add(thickForestPath);
        forestPath.setConnectedRooms(connections2);

        // meadow path connections
        ArrayList<Room> connections3 = new ArrayList<Room>();
        connections3.add(meadowClearing);
        connections3.add(bendyPath);
        meadowPath.setConnectedRooms(connections3);

        // forest clearing connections
        ArrayList<Room> connections4 = new ArrayList<Room>();
        connections4.add(forestPath);
        connections4.add(thickForestPath);
        connections4.add(acornPath);
        forestClearing.setConnectedRooms(connections4);

        // meadow clearing connections
        ArrayList<Room> connections5 = new ArrayList<Room>();
        connections5.add(meadowPath);
        connections5.add(flowerPath);
        connections5.add(windyPath);
        meadowClearing.setConnectedRooms(connections5);

        // rocky clearing connections
        ArrayList<Room> connections6 = new ArrayList<Room>();
        connections6.add(rockyPath);
        connections6.add(steepPath);
        rockyClearing.setConnectedRooms(connections6);

        // windy clearing connections
        ArrayList<Room> connections7 = new ArrayList<Room>();
        connections7.add(windyPath);
        connections7.add(bendyPath);
        windyClearing.setConnectedRooms(connections7);

        // thick forest path connections
        ArrayList<Room> connections8 =new ArrayList<Room>();
        connections8.add(forestClearing);
        connections8.add(darkPath);
        connections8.add(acornPath);
        thickForestPath.setConnectedRooms(connections8);

        // bendy path connections
        ArrayList<Room> connections9 = new ArrayList<Room>();
        connections9.add(meadowPath);
        connections9.add(windyClearing);
        connections9.add(rockyPath);
        bendyPath.setConnectedRooms(connections9);

        // rocky path connections
        ArrayList<Room> connections10 = new ArrayList<Room>();
        connections10.add(rockyClearing);
        connections10.add(bendyPath);
        rockyPath.setConnectedRooms(connections10);

        // windy path connections
        ArrayList<Room> connections11 = new ArrayList<Room>();
        connections11.add(windyClearing);
        connections11.add(meadowClearing);
        windyPath.setConnectedRooms(connections11);

        // steep path connections
        ArrayList<Room> connections12 = new ArrayList<Room>();
        connections12.add(flowerPath);
        steepPath.setConnectedRooms(connections12);

        // flower path connections
        ArrayList<Room> connections13 = new ArrayList<Room>();
        connections13.add(goodPath);
        connections13.add(meadowPath);
        flowerPath.setConnectedRooms(connections13);

        // dark path connections
        ArrayList<Room> connections14 = new ArrayList<Room>();
        connections14.add(badPath);
        //connections14.add(thickForestPath);
        darkPath.setConnectedRooms(connections14);

        // acron path connections
        ArrayList<Room> connections15 = new ArrayList<Room>();
        connections15.add(forestClearing);
        connections15.add(thickForestPath);
        acornPath.setConnectedRooms(connections15);

        // forest clearing contents
        ArrayList<Creature> forestClearingContents = new ArrayList<>();
        Wyvern wyvernForest = new Wyvern("Wyvern");
        forestClearingContents.add(wyvernForest);
        forestClearing.setRoomContents(forestClearingContents);

        // meadow clearing contents
        ArrayList<Creature> meadowClearingContents = new ArrayList<>();
        Minotaur minotaurMeadow = new Minotaur("Minotaur");
        meadowClearingContents.add(minotaurMeadow);
        meadowClearing.setRoomContents(meadowClearingContents);

        // windy clearing contents
        ArrayList<Creature> windyClearingContents = new ArrayList<>();
        Minotaur minotaurWindy = new Minotaur("Minotaur");
        windyClearingContents.add(minotaurWindy);
        windyClearing.setRoomContents(windyClearingContents);

        // rocky clearing contents
        ArrayList<Creature> rockyClearingContents = new ArrayList<>();
        Wyvern wyvernRocky = new Wyvern("Wyvern");
        rockyClearingContents.add(wyvernRocky);
        rockyClearing.setRoomContents(rockyClearingContents);

        // forest path contents
        ArrayList<Creature> forestPathContent = new ArrayList<>();
        Sprite forestSprite = new Sprite("Sprite");
        Newt forestNewt = new Newt("Newt");
        forestPathContent.add(forestSprite);
        forestPathContent.add(forestNewt);
        forestPath.setRoomContents(forestPathContent);

        // meadow path contents
        ArrayList<Creature> meadowPathContents = new ArrayList<>();
        Sprite meadowSprite = new Sprite("Sprite");
        meadowPathContents.add(meadowSprite);
        Rabbit meadowRabbit = new Rabbit("Rabbit");
        meadowPathContents.add(meadowRabbit);
        meadowPath.setRoomContents(meadowPathContents);

        // bendy path contents
        ArrayList<Creature> bendyPathContents = new ArrayList<>();
        Newt bendyNewt = new Newt("Newt");
        bendyPathContents.add(bendyNewt);
        Sprite bendySprite = new Sprite("Sprite");
        bendyPathContents.add(bendySprite);
        bendyPath.setRoomContents(bendyPathContents);

        // rocky path contents
        ArrayList<Creature> rockyPathContents = new ArrayList<>();
        Sprite rockySprite = new Sprite("Sprite");
        rockyPathContents.add(rockySprite);
        Newt rockyNewt = new Newt("Newt");
        rockyPathContents.add(rockyNewt);
        rockyPath.setRoomContents(rockyPathContents);

        // windy path contents
        ArrayList<Creature> windyPathContents = new ArrayList<>();
        Sprite windySprite = new Sprite("Sprite");
        windyPathContents.add(windySprite);
        windyPath.setRoomContents(windyPathContents);

        // flower path contents
        ArrayList<Creature> flowerPathContents = new ArrayList<>();
        Sprite flowerSprite =new Sprite("Sprite");
        flowerPathContents.add(flowerSprite);
        Rabbit flowerRabbit = new Rabbit("Rabbit");
        flowerPathContents.add(flowerRabbit);
        flowerPath.setRoomContents(flowerPathContents);

        // acorn path contents
        ArrayList<Creature> acornPathContents = new ArrayList<>();
        Sprite acornSprite = new Sprite("Sprite");
        acornPathContents.add(acornSprite);
        Rabbit acornRabbit = new Rabbit("Rabbit");
        acornPathContents.add(acornRabbit);
        acornPath.setRoomContents(acornPathContents);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello adventurer! What is your name?");
        String userName = userInput.nextLine();

        Player player = new Player(userName, startingClearing);
        player.sayHi();

        System.out.println("To look in you pouch press I");
        System.out.println("To check your health press H");
        System.out.println("To attack press A");
        System.out.println("To dodge press D");
        System.out.println("To catch a creature press C");
        System.out.println("To move forward on your path press M");
        System.out.printf("Please use the numbers on your keyboard to choose your path.%n%n");


        while (player.health > 0){

            startingClearing.getDescription();
            System.out.println("What would you like to do?");
            String choice = userInput.nextLine();

            if (choice.equalsIgnoreCase("m")){
                player.moveRooms(player.location);
            } else if (choice.equalsIgnoreCase("i")) {
                player.viewInventory();
            } else if (choice.equalsIgnoreCase("h")){
                player.sayHi();
            } else if (choice.equalsIgnoreCase("a")){
                // initiates attack on aggressive creature based on player location
                // makes a roll to determine type of attack
                if (player.location == forestClearing){
                    while(player.health > 0 || wyvernForest.health > 0) {
                        player.attack(wyvernForest);
                        Random random = new Random();
                        int attackType = random.nextInt(1, 2);
                        if (attackType == 1) {
                            wyvernForest.attack(player);
                        } else if (attackType == 2){
                            wyvernForest.specialQuickAttack(player);
                        }
                    }
                }else if (player.location == rockyClearing){
                    while(player.health > 0 || wyvernRocky.health > 0) {
                        player.attack(wyvernRocky);
                        Random random = new Random();
                        int attackType = random.nextInt(1, 2);
                        if (attackType == 1) {
                            wyvernRocky.attack(player);
                        } else if (attackType == 2){
                            wyvernRocky.specialQuickAttack(player);
                        }
                    }
                } else if (player.location == meadowClearing){
                    while(player.health > 0 || minotaurMeadow.health > 0) {
                        player.attack(minotaurMeadow);
                        Random random = new Random();
                        int attackType = random.nextInt(1, 2);
                        if (attackType == 1) {
                            minotaurMeadow.attack(player);
                        } else if (attackType == 2){
                            minotaurMeadow.specialHeavyAttack(player);
                        }
                    }
                } else if (player.location == windyClearing){
                    while(player.health > 0 || minotaurWindy.health > 0) {
                        player.attack(minotaurWindy);
                        Random random = new Random();
                        int attackType = random.nextInt(1, 2);
                        if (attackType == 1) {
                            minotaurWindy.attack(player);
                        } else if (attackType == 2){
                            minotaurWindy.specialHeavyAttack(player);
                        }
                    }
                }
            }

        }

    }
}
