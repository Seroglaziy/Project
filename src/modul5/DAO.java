package modul5;

import java.util.ArrayList;

/**
 * Created by Семья on 23.11.2016.
 */
public interface DAO  {

    boolean save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    ArrayList<Room> getAll();




}


