package sda.model;

public class Room {

    //Dodaj klasę Room reprezentującą pojedynczy pokój (nr pokoju, ilu osobowy, czy w pokoju jest łazienka - true/false oraz czy pokój jest dostępny - true/false)

    private int roomNumber;
    private int numberOfGuests;
    private boolean bathroom;
    private boolean available;

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", numberOfGuests=" + numberOfGuests +
                ", bathroom=" + bathroom +
                ", available=" + available +
                '\n';
    }

    public Room(int roomNumber, int numberOfGuests, boolean bathroom, boolean available) {
        this.roomNumber = roomNumber;
        this.numberOfGuests = numberOfGuests;
        this.bathroom = bathroom;
        this.available = available;

    }

    public boolean isAvailable() {
        return available;
    }
}
