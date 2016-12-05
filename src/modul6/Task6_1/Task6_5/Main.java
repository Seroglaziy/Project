package modul6.Task6_1.Task6_5;

import java.util.Arrays;

/**
 * Created by Семья on 05.12.2016.
 */
public class Main {


    public static void main(String[] args) {

        User user1 = new User(1111, "Timchenko", "Vadim", 3200, 2500);
        User user2 = new User(2222, "Kayte", "Biluchevskaya", 3200, 12000);
        User user3 = new User(2222, "Stepanenko", "Julia", 3200, 3500);
        User user4 = new User(3333, "Azhymova", "Tetyana", 3200, 12000);
        User user5 = user1;
        User[] users = {user1, user2, user3, user4, user5};

        System.out.println("================== Работаем с массивами =================================");
        System.out.println();

        int[] arr1 = {1, 2, 3, 4, 53, 6, 7, 8, 9, 10, 53, 2, 0, 1, 22};
        System.out.println(Arrays.toString(arr1));

        
        arr1 = ArraysUtils.reverse(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(arr1)));

        System.out.println();
        System.out.println("================== Работаем с Юзерами =======================================");
        System.out.println();

        UserUtils us = new UserUtils();
        User[] uniq = us.uniqueUsers(users);
        System.out.println(Arrays.toString(uniq));
        System.out.println(Arrays.toString(us.usersWithContitionalBalance(uniq, 2500)));
        User[] now = users;
        now[4] = null;

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();

        System.out.println(Arrays.toString(now));
        System.out.println(Arrays.toString(us.deleteEmptyUsers(now)));

    }


}
