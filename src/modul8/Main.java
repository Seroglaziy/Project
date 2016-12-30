package modul8;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Семья on 30.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User test = new User("Вадим");

        List<User> work = new ArrayList<>();
        work.add(new User("Андрей"));
        work.add(new User("Дмитрий"));
        work.add(new User("Семен"));
        System.out.println("Work " + work);


        userDAO.save(test);

        System.out.println("Without work list "+userDAO.getDataBase());
        userDAO.saveAll(work);
        System.out.println("Save work list "+userDAO.getDataBase());
        userDAO.deleteAll(work);
        System.out.println("Delete work list"+userDAO.getDataBase());
        userDAO.delete(test);
        System.out.println("DataBase without test "+userDAO.getDataBase());





    }
}
