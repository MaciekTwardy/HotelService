package sda.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public Hotel() {
        rooms.add(new Room(10, 5, true, true));
        rooms.add(new Room(8, 1, true, true));
        rooms.add(new Room(5, 2, true, true));
        rooms.add(new Room(7, 3, true, true));
        rooms.add(new Room(2, 1, true, true));
        rooms.add(new Room(4, 2, true, false));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
