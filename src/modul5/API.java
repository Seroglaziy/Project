package modul5;

import java.sql.Connection;

/**
 * Created by Семья on 23.11.2016.
 */
public interface API {


     Room[] findRooms(int price, int persons, String city, String hotel);

     Room[] getRooms();


}