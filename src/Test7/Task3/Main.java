package Test7.Task3;



import Test7.ComparatorPriceUser;
import Test7.Order;
import Test7.User;


import java.util.*;

/**
 * Created by Семья on 20.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        Set<Order> orderTreeSet = new TreeSet<>();
        Currency curUsd = Currency.getInstance("USD");

        orderTreeSet.add(new Order(1, 100, curUsd, "Item", "Shop", new User(1, "Vadim", "Petrov", "Kiev", 100)));
        orderTreeSet.add(new Order(1, 100, curUsd, "Item", "Shop", new User(1, "Vadim", "Petrov", "Kiev", 100)));
        orderTreeSet.add(new Order(2, 200, curUsd, "Item2", "Shop2", new User(2, "Vadima", "Timchenkoo", "Odessa", 200)));
        orderTreeSet.add(new Order(3, 300, curUsd, "Item3", "Shop3", new User(3, "Vadimaa", "Timchenkoa", "Lviv", 300)));
        orderTreeSet.add(new Order(4, 400, curUsd, "Item4", "Shop4", new User(4, "Vadims", "Timchenkos", "Kharkiv", 400)));
        orderTreeSet.add(new Order(5, 500, curUsd, "Item5", "Shop5", new User(5, "Vadimd", "Timchenkod", "Krivoy rog", 500)));
        orderTreeSet.add(new Order(6, 600, curUsd, "Item6", "Shop6", new User(6, "Vadimf", "Timchenkof", "Hmelnitsk", 600)));
        orderTreeSet.add(new Order(7, 700, curUsd, "Item7", "Shop7", new User(7, "Vadimg", "Timchenkog", "Chernigiv", 700)));
        orderTreeSet.add(new Order(8, 800, curUsd, "Item8", "Shop8", new User(8, "Vadimh", "Timchenkoh", "Zakarpatye", 800)));
        orderTreeSet.add(new Order(9, 900, curUsd, "Item9", "Shop9", new User(9, "Vadimj", "Timchenkoj", "Summy", 900)));
        orderTreeSet.add(new Order(10, 10, curUsd, "Item10", "Shop10", new User(10, "Vadimk", "Timchenkok", "Cherrkassu", 1000)));

        for (Order order : orderTreeSet) {
            System.out.println(orderTreeSet);
        }

        Collections.sort(orderTreeSet, new ComparatorPriceUser());



        System.out.println("==================================");
        for (Order order : orderTreeSet) {
            System.out.println(orderTreeSet);


        }


    }


}




