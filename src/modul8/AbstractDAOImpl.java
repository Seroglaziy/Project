package modul8;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by Семья on 30.12.2016.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    protected List<T> dataBase = new LinkedList<>();

    @Override
    public T save(T aSave) {
        dataBase.add(aSave);
        return null;
    }

    @Override
    public void delete(T aDelete) {
        dataBase.remove(aDelete);

    }

    @Override
    public void deleteAll(List<T> list) {
        dataBase.removeAll(list);

    }

    @Override
    public void saveAll(List<T> list) {
        dataBase.addAll(list);

    }

    @Override
    public void deleteById(long id) {

    }


    @Override
    public T getByID(long id) {
        return null;
    }

    public List<T> getDataBase() {
        return dataBase;
    }
}

