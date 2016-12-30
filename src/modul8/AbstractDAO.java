package modul8;

import java.util.List;

/**
 * Created by Семья on 30.12.2016.
 */
public interface AbstractDAO<T> {

    T save(T aSave);

    void delete(T aDelete);

    void deleteAll(List<T> list);

    void saveAll(List<T> list);

    List<T> getDataBase();

    void deleteById(long id);

    T getByID(long id);


}
