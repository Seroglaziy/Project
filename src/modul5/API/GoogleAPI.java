package modul5.API;

import modul5.entities.Room;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Семья on 29.01.2017.
 */
public class GoogleAPI implements API {
    private ArrayList<Room> googleRooms;

    public GoogleAPI() {
        /*this.googleRooms = new Room[5];
        this.googleRooms[0] = new Room(111, 600, 4, new Date(), "Hilton", "Kiev");
        this.googleRooms[1] = new Room(222, 1250, 1, new Date(), "Ukraine", "Kiev");
        this.googleRooms[2] = new Room(333, 500, 8, new Date(), "Radisson", "Lviv");
        this.googleRooms[3] = new Room(444, 300, 3, new Date(), "Ace hotel", "NY City");
        this.googleRooms[4] = new Room(555, 500, 5, new Date(), "The Roosevelt Hotel", "Boston");*/
        this.googleRooms = new ArrayList<>();
        this.googleRooms.add(new Room(111, 600, 4, new Date(), "Hilton", "Kiev"));
        this.googleRooms.add(new Room(222, 1250, 1, new Date(), "Ukraine", "Kiev"));
        this.googleRooms.add(new Room(333, 500, 8, new Date(), "Radisson", "Lviv"));
        this.googleRooms.add(new Room(444, 300, 3, new Date(), "Ace hotel", "NY City"));
        this.googleRooms.add(new Room(555, 500, 5, new Date(), "The Roosevelt Hotel", "Boston"));

    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
/*        Room[] requiredRooms = new Room[0];
        for (Room requiredRoom : this.googleRooms) {
            if (requiredRoom.getPrice() == price && requiredRoom.getPersons() == persons
                    && requiredRoom.getCityName().equals(city) && requiredRoom.getHotelName().equals(hotel)) {
                requiredRooms = Arrays.copyOf(requiredRooms, requiredRooms.length + 1);
                requiredRooms[requiredRooms.length - 1] = requiredRoom;
            }
        }
        return requiredRooms;*/
        ArrayList<Room> requiredRooms = new ArrayList<>();
        for (Room requiredRoom : this.googleRooms){
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
