package modul5;

import java.sql.Connection;
import java.util.Date;




/**
 * Created by Семья on 23.11.2016.
 */
public class BookingComAPI implements API {

    public Room[] rooms;

    public BookingComAPI() {
        rooms = new Room[5];
        Date date = new Date();
        rooms[0] = new Room(100, 1000, 100, date, "Братислава", "Киев");
        rooms[1] = new Room(200, 1500, 200, date, "Premier Palace", "Киев");
        rooms[2] = new Room(300, 1800, 300, date, "Днепр", "Киев");
        rooms[3] = new Room(400, 2000, 400, date, "Турис", "Киев");
        rooms[4] = new Room(500, 2200, 500, date, "Славутич", "Киев");

    }





    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
    return new Room[0];
}

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}


