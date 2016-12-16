package modul5;


import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {

    private ArrayList<Room> tripAdvisorRooms;

    public TripAdvisorAPI() {
        this.tripAdvisorRooms.add(new Room(1111, 570, 3, new Date(), "Zirka", "Ternopil"));
        this.tripAdvisorRooms.add(new Room(2222, 150, 1, new Date(), "Lviv", "Lviv"));
        this.tripAdvisorRooms.add(new Room(3333, 200, 4, new Date(), "Hayat", "Kyiv"));
        this.tripAdvisorRooms.add(new Room(4444, 500, 1, new Date(), "Radisson", "Paris"));
        this.tripAdvisorRooms.add(new Room(5555, 1500, 5, new Date(), "Mariott Hotel", "Warsaw"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
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