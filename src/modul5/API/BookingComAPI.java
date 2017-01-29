package modul5.API;

import modul5.entities.Room;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Семья on 29.01.2017.
 */
public class BookingComAPI implements API {
    private ArrayList<Room> bookingComRooms;

    public BookingComAPI() {
        this.bookingComRooms = new ArrayList<>();
        this.bookingComRooms.add(new Room(11, 200, 4, new Date(), "Hayat", "Kiev"));
        this.bookingComRooms.add(new Room(22, 250, 1, new Date(), "Ukraine", "Kiev"));
        this.bookingComRooms.add(new Room(33, 1500, 8, new Date(), "Radisson", "Lviv"));
        this.bookingComRooms.add(new Room(44, 300, 3, new Date(), "Ace hotel", "NY City"));
        this.bookingComRooms.add(new Room(55, 500, 5, new Date(), "The Roosevelt Hotel", "Boston"));

    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        /*Room[] requiredRooms = new Room[0];
        for (Room requiredRoom : this.bookingComRooms) {
            if (requiredRoom.getPrice() == price && requiredRoom.getPersons() == persons
                    && requiredRoom.getCityName().equals(city) && requiredRoom.getHotelName().equals(hotel)) {
                requiredRooms = Arrays.copyOf(requiredRooms, requiredRooms.length + 1);
                requiredRooms[requiredRooms.length - 1] = requiredRoom;
            }
        }
        return requiredRooms;*/
        ArrayList<Room> requiredRooms = new ArrayList<>();
        for (Room requiredRoom : this.bookingComRooms){
            if (requiredRoom.getPrice() == price && requiredRoom.getPersons() == persons
                    && requiredRoom.getCityName().equals(city) && requiredRoom.getHotelName().equals(hotel)) {
                requiredRooms.add(requiredRoom);
            }
        }
        return requiredRooms;
    }

    @Override
    public ArrayList<Room> getAll() {
        return bookingComRooms;
    }
}
