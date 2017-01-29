package modul5.API;

import modul5.entities.Room;

import java.util.ArrayList;

/**
 * Created by Семья on 29.01.2017.
 */
public interface API {
    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);

    ArrayList<Room> getAll();
}
