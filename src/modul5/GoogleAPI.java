package modul5;


import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {
    private ArrayList<Room> googleRooms;

    public GoogleAPI() {

        this.googleRooms = new ArrayList<>();
        this.googleRooms.add(new Room(111, 600, 4, new Date(), "Hilton", "Kiev"));
        this.googleRooms.add(new Room(222, 1250, 1, new Date(), "Ukraine", "Kiev"));
        this.googleRooms.add(new Room(333, 500, 8, new Date(), "Radisson", "Lviv"));
        this.googleRooms.add(new Room(444, 300, 3, new Date(), "Ace hotel", "NY City"));
        this.googleRooms.add(new Room(555, 500, 5, new Date(), "The Roosevelt Hotel", "Boston"));

    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> requiredRooms = new ArrayList<>();
        for (Room requiredRoom : this.googleRooms) {
            if (requiredRoom.getPrice() == price && requiredRoom.getPersons() == persons
                    && requiredRoom.getCityName().equals(city) && requiredRoom.getHotelName().equals(hotel)) {
                requiredRooms.add(requiredRoom);
            }
        }
        return requiredRooms;
    }

    @Override
    public ArrayList<Room> getAll() {
        return googleRooms;
    }
}