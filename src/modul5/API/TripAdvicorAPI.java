package modul5.API;

import modul5.entities.Room;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Семья on 29.01.2017.
 */
public class TripAdvicorAPI implements API {
    private ArrayList<Room> tripAdvisorRooms;

    public TripAdvicorAPI() {
        /*this.tripAdvisorRooms = new Room[5];
        this.tripAdvisorRooms[0] = new Room(1111, 570, 3, new Date(), "Zirka", "Ternopil");
        this.tripAdvisorRooms[1] = new Room(2222, 150, 1, new Date(), "Lviv", "Lviv");
        this.tripAdvisorRooms[2] = new Room(3333, 200, 4, new Date(), "Hayat", "Kyiv");
        this.tripAdvisorRooms[3] = new Room(4444, 500, 1, new Date(), "Radisson", "Paris");
        this.tripAdvisorRooms[4] = new Room(5555, 1500, 5, new Date(), "Mariott Hotel", "Warsaw");*/
        this.tripAdvisorRooms = new ArrayList<>();
        this.tripAdvisorRooms.add(new Room(1111, 570, 3, new Date(), "Zirka", "Ternopil"));
        this.tripAdvisorRooms.add(new Room(2222, 150, 1, new Date(), "Lviv", "Lviv"));
        this.tripAdvisorRooms.add(new Room(3333, 200, 4, new Date(), "Hayat", "Kyiv"));
        this.tripAdvisorRooms.add(new Room(4444, 500, 1, new Date(), "Radisson", "Paris"));
        this.tripAdvisorRooms.add(new Room(5555, 1500, 5, new Date(), "Mariott Hotel", "Warsaw"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
/*        Room[] requiredRooms = new Room[0];
        for (Room requiredRoom : this.tripAdvisorRooms) {
            if (requiredRoom.getPrice() == price && requiredRoom.getPersons() == persons
                    && requiredRoom.getCityName().equals(city) && requiredRoom.getHotelName().equals(hotel)) {
                requiredRooms = Arrays.copyOf(requiredRooms, requiredRooms.length + 1);
                requiredRooms[requiredRooms.length - 1] = requiredRoom;
            }
        }
        return requiredRooms;*/
        ArrayList<Room> requiredRooms = new ArrayList<>();
        for (Room requiredRoom : this.tripAdvisorRooms) {
            if (requiredRoom.getPrice() == price && requiredRoom.getPersons() == persons
                    && requiredRoom.getCityName().equals(city) && requiredRoom.getHotelName().equals(hotel)) {
                requiredRooms.add(requiredRoom);
            }
        }
        return requiredRooms;
    }

    @Override
    public ArrayList<Room> getAll() {
        return tripAdvisorRooms;
    }
}