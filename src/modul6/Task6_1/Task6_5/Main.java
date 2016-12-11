package modul6.Task6_1.Task6_5;



/**
 * Created by Семья on 02.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];

        users[0] = new User(1, "Anna", "N", 500, 2340);
        users[1] = new User(1, "Anna", "N", 500, 2340);
        users[2] = new User(2, "Lena", "N", 500, 2140);
        users[3] = null;
        users[4] = new User(3, "Ivan", "N", 600, 340);
        users[5] = new User(4, "Evgeniy", "N", 300, 340);
        users[6] = new User(5, "Irina", "N", 800, 340);
        users[7] = null;
        users[8] = new User(6, "John", "N", 200, 20);
        users[9] = new User(7, "Steve", "N", 500, 0);

        userArrayPrint(users);
        System.out.println("");
        System.out.println("==============");
        System.out.println("");

        for (long id : UserUtils.getUsersId(users)) {
            System.out.println(id);
        }

        System.out.println("");
        System.out.println("==============");
        System.out.println("");

        userArrayPrint(UserUtils.usersWithConditionalBalance(users, 340));

        System.out.println("");
        System.out.println("==============");
        System.out.println("");

        userArrayPrint(UserUtils.deleteEmptyUsers(users));

        System.out.println("");
        System.out.println("==============");
        System.out.println("");

        userArrayPrint(UserUtils.paySalaryToUser(users));

        System.out.println("");
        System.out.println("==============");
        System.out.println("");

        userArrayPrint(UserUtils.uniqueUsers(users));

    }

    private static void userArrayPrint(User[] array) {
        for (User user : array) {
            if (user != null) {
                System.out.println(user.toString());
            } else {
                System.out.println("NULL");
            }

        }
    }
}