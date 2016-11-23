package modul5;

import java.math.RoundingMode;

/**
 * Created by Семья on 23.11.2016.
 */
public class TripAdvisorAPI implements API {


    public TripAdvisorAPI(Room[]rooms){
        this.rooms = rooms;

    }

    Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}

