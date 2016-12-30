package modul8;


/**
 * Created by Семья on 30.12.2016.
 */
public class UserDAO extends AbstractDAOImpl<User> {

    public UserDAO() {
        save(new User("Дмитрий"));
        save(new User("Алексей"));
        save(new User("Михаил"));
    }

    @Override

    public void deleteById(long id) {
        for (User user : dataBase) {
            if (user.getId() == id)
                dataBase.remove(user);
        }

    }


    @Override
    public User getByID(long id) {
        for (User user : dataBase) {
            if (user.getId() == id)
                return user;
        }

        return null;
    }
}




