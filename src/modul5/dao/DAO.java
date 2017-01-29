package modul5.dao;

import modul5.entities.Room;

import java.util.ArrayList;

/**
 * Created by Семья on 29.01.2017.
 */
public interface DAO {
    boolean save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    ArrayList<Room> getAll();
}
