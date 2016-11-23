package modul5;

import java.math.RoundingMode;
import java.util.Date;

/**
 * Created by Семья on 23.11.2016.
 */
public class TripAdvisorAPI implements API {

    public TripAdvisorAPI() {

        Date date = new Date();
        Room[] rooms = new Room[5];
        rooms[0] = new Room(150 , 250 , 350 , date , "Сапфир" , "Киев");
        rooms[1] = new Room(250, 350, 450 , date , "Украина" , "Киев");
        rooms[2] = new Room(350 , 450 , 550 , date , "Крещатик" , "Киев");
        rooms[3] = new Room(450 , 550 , 650 , date , "АпартОтель", "Киев");
        rooms[4] = new Room(325 , 425 , 525, date , "Воздвиженский" , "Киев");

    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}

