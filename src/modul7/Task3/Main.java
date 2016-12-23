package modul7.Task3;

import modul7.Task1.Order;
import modul7.Task1.User;

import java.util.*;

/**
 * Created by Семья on 23.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        TreeSet<Order> orderTreeSet = new TreeSet<>();
        Random ran = new Random();
        Currency currency1 = Currency.getInstance(Locale.US);
        Currency currency2 = Currency.getInstance("UAH");

        orderTreeSet.add(new Order(10, currency1, "ITEM", "SHOP", new User(20, "U1", "1", "C1", 0)));
        orderTreeSet.add(new Order(250, currency1, "ITEM", "SHOP", new User(20, "U2", "2", "C2", 30)));
        orderTreeSet.add(new Order(333, currency2, "ITEM", "SHOP", new User(20, "U3", "3", "C3", 36600)));
        orderTreeSet.add(new Order(23, currency1, "ITEM", "SHOP", new User(20, "U4", "4", "C4", 1200)));
        orderTreeSet.add(new Order(1234, currency2, "ITEM", "SHOP", new User(20, "U5", "5", "C5", 530)));
        orderTreeSet.add(new Order(635, currency1, "ITEM", "SHOP", new User(20, "U6", "6", "C6", 5600)));
        orderTreeSet.add(new Order(142, currency1, "ITEM", "SHOP", new User(20, "U7", "7", "C7", 300)));
        orderTreeSet.add(new Order(657, currency2, "ITEM", "SHOP", new User(20, "U8", "8", "C8", 1500)));
        orderTreeSet.add(new Order(100, currency1, "ITEM", "SHOP", new User(20, "USER", "Petrov", "LVIV", 500)));
        orderTreeSet.add(new Order(100, currency1, "ITEM", "SHOP", new User(20, "USER", "Petrov", "LVIV", 500)));

        System.out.println(orderTreeSet);
        System.out.println("=================================");

        System.out.println(treeSetCheckForUserLastName(orderTreeSet));
        System.out.println("=================================");

        System.out.println(orderTreeSet.first()); //orderTreeSet sorted by price descending by default. first element - order with highest price

        System.out.println("=================================");

        System.out.println(deleteUSDOrders(orderTreeSet));

    }


    private static boolean treeSetCheckForUserLastName(TreeSet<Order> inputSet) {
        for (Order order : inputSet) {
            if (order.getUser().getLastName().equals("Petrov")) {
                return true;
            }
        }
        return false;
    }

    private static TreeSet<Order> deleteUSDOrders(TreeSet<Order> inputSet) {
        TreeSet<Order> resultSet = new TreeSet<>(inputSet);
        Iterator<Order> iterator = resultSet.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency().equals(Currency.getInstance("USD"))) {
                iterator.remove();
            }
        }
        return resultSet;

    }
}
