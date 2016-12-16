package modul5;


import java.util.ArrayList;

/**
 * Created by Семья on 23.11.2016.
 */
public interface API {


     ArrayList<Room> findRooms(int price, int persons, String city, String hotel);

     ArrayList<Room> getAll();



}