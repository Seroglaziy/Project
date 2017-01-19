package modul7.hwModul5;




import java.util.ArrayList;

/**
 * Created by Семья on 19.01.2017.
 */
public interface API {
    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);
}
