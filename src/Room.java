import java.util.ArrayList;

public class Room {

    String name;
    String description;
    ArrayList<Room> connectedRooms;
    ArrayList<Room> roomContents;

    Room(String name){
        this.name = name;

    }

    public String getDescription(){
        return description;
    }

    void setConnectedRooms(ArrayList<Room> connectedRooms){
        this.connectedRooms = connectedRooms;
    }

    void setRoomContents(ArrayList<Room> roomContents){
        this.roomContents = roomContents;
    }

}
