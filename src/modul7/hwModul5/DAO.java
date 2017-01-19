package modul7.hwModul5;

import java.util.ArrayList;

/**
 * Created by Семья on 19.01.2017.
 */
public interface DAO {
    ArrayList<Room> save(ArrayList<Room> rooms, Room room);
    ArrayList<Room> delete(ArrayList<Room> rooms, long id);
    ArrayList<Room> update(ArrayList<Room> rooms, Room room);
    Room findById(ArrayList<Room> rooms, long id);
}
