import java.util.ArrayList;
import java.util.Scanner;

public class Room {

    String name;
    String description;
    ArrayList<Room> connectedRooms;
    ArrayList<Creature> roomContents;

    Room(String name){
        this.name = name;

    }

    void getDescription(){
        System.out.printf("%s%n", name);
        System.out.printf("%s%n", description);
    }

    void seeRooms(ArrayList<Room> connectedRooms) {
            System.out.println("Connected Rooms are:");
            for (Room room : connectedRooms) {
                System.out.println("    " + room.name);
            }
            System.out.println("Where would you like to go?");
    }

    void seeContent(){
        for (Creature creature : roomContents){
            creature.display();
        }
    }

    void setConnectedRooms(ArrayList<Room> connectedRooms){
        this.connectedRooms = connectedRooms;
    }

    void setRoomContents(ArrayList<Creature> roomContents){
        this.roomContents = roomContents;
    }

}
