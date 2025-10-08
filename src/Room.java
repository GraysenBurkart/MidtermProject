import java.util.ArrayList;
import java.util.Scanner;

public class Room {

    String name;
    String description;
    ArrayList<Room> connectedRooms;
    ArrayList<Room> roomContents;
    boolean move = true;

    Room(String name){
        this.name = name;

    }

    void getDescription(){
        System.out.printf("%s%n", description);
    }

    void seeRooms(ArrayList<Room> connectedRooms) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n",name);
        System.out.printf("%s%n", description);
            System.out.println("Connected Rooms are:");
            for (Room room : connectedRooms) {
                System.out.println("    " + room.name);
            }
            System.out.println("Where would you like to go?");
            int choice = input.nextInt();

    }

    void setConnectedRooms(ArrayList<Room> connectedRooms){
        this.connectedRooms = connectedRooms;
    }

    void setRoomContents(ArrayList<Room> roomContents){
        this.roomContents = roomContents;
    }

}
