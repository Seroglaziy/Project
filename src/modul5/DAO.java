package modul5;

/**
 * Created by Семья on 23.11.2016.
 */
public interface DAO  {





    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Room[] getAll();

}


