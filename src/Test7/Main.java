package Test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.List;

/**
 * Created by Семья on 19.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        List<Order> orderList = new ArrayList<>();
        Currency curUsd = Currency.getInstance("USD");
        Currency curUah = Currency.getInstance("UAH");

        orderList.add(new Order(1, 200, curUsd, "Item1", "Shop1", new User(1, "Vadim", "Timchenko", "Kiev", 1000)));

        orderList.add(new Order(2, 300, curUsd, "Item1", "Shop2", new User(2, "Alexandr", "Timchen", "Lviv", 1200)));

        orderList.add(new Order(3, 400, curUsd, "Item1", "Shop3", new User(3, "Oleg", "Timche", "Kharkiv", 1300)));

        orderList.add(new Order(4, 500, curUsd, "Item4", "Shop4", new User(4, "Tolik", "Timcheno", "Dnepr", 1400)));

        orderList.add(new Order(5, 600, curUsd, "Item5", "Shop5", new User(5, "Kolya", "Tchenko", "Odessa", 1500)));

        orderList.add(new Order(6, 700, curUah, "Item6", "Shop6", new User(6, "Petya", "Tchenko", "Kirovograd", 1600)));

        orderList.add(new Order(7, 800, curUah, "Item7", "Shop7", new User(7, "Dima", "Thenko", "Krivoy Rog", 1700)));

        orderList.add(new Order(8, 900, curUah, "Item8", "Shop8", new User(8, "Semen", "Tinko", "Zakarpatye", 1800)));

        orderList.add(new Order(9, 10, curUah, "Item9", "Shop9", new User(9, "Andrey", "Timko", "Hmelnitsk", 1900)));

        orderList.add(new Order(10, 20, curUah, "Item10", "Shop10", new User(10, "Maks", "Tmchenko", "Krum", 2000)));


        // Удаление элементов где цена ниже 1500!
        //   orderList.remove(0);
        //   orderList.remove(1);
        //   orderList.remove(2);
        //   orderList.remove(3);
        //   orderList.remove(4);
        //   System.out.println("==============================================");




        for (Order order : orderList) {
            System.out.println(order);
        }
        System.out.println("=============================================");

        Collections.sort(orderList);


        for (Order order : orderList) {
            System.out.println(order);
        }
        System.out.println("=============================================");

        //Collections.sort(orderList, new ComparatorPriceUser());

        for (Order order : orderList) {
            System.out.println(order);
        }
        System.out.println("=============================================");

        Collections.sort(orderList, new ComparatorItemIDCity());
        for (Order order : orderList) {
            System.out.println(order);
        }



        }


    }

