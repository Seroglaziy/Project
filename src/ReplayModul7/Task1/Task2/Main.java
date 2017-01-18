package ReplayModul7.Task1.Task2;


import ReplayModul7.Task1.Compare.NameShopIDUserCityComparator;
import ReplayModul7.Task1.Compare.PriceComparator;
import ReplayModul7.Task1.Compare.PriceUserCityComparator;
import ReplayModul7.Task1.Order;
import ReplayModul7.Task1.User;

import java.util.*;

/**
 * Created by Семья on 18.01.2017.
 */
public class Main {

    public static void main(String[] args) {


        Random ran = new Random();
        Currency curUsd = Currency.getInstance("USD");
        Currency curUah = Currency.getInstance("UAH");
        Currency curEur = Currency.getInstance("EUR");

        List<Order> orderList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            orderList.add(i, new Order(ran.nextInt(3), curUsd, "Item" + ran.nextInt(2), "Shop" + ran.nextInt(2),
                    new User(i, "U" + i, "L" + i, "Kiev" + ran.nextInt(3), ran.nextInt(100))));
        }
        orderList.add(6, new Order(200, curEur, "I", "S", new User(20, "USER", "USER", "ODESSA", 500)));
        orderList.add(7, new Order(200, curEur, "I", "S", new User(20, "USER", "USER", "ODESSA", 500)));

        orderList.add(8, new Order(2000, curUah, "ITEM", "SHOP", new User(20, "USER", "USER", "LVIV", 500)));
        orderList.add(9, new Order(2000, curUah, "ITEM", "SHOP", new User(20, "USER", "USER", "LVIV", 500)));

        System.out.print("Generated ");
        printArrayList(orderList);

        Collections.sort(orderList);

        System.out.print("Default sorted ");
        printArrayList(orderList);

        Collections.sort(orderList, new PriceComparator());


        System.out.print("Price descending sorted ");
        printArrayList(orderList);

        Collections.sort(orderList, new PriceUserCityComparator());

        System.out.print("Price ascending AND UserCity sorted ");
        printArrayList(orderList);

        Collections.sort(orderList, new NameShopIDUserCityComparator());

        Collections.sort(orderList);

        System.out.print("ItemName AND ShopID AND UserCity sorted ");
        printArrayList(orderList);

        System.out.print("With removed duplicates ");
        printArrayList(deleteDuplicates(orderList));

        System.out.print("With price not lower than 1500 ");
        printArrayList(filterByLowestPrice(orderList));


        System.out.println("MAP1");
        System.out.println(splitByCurrency(orderList));

        System.out.println("MAP2");
        System.out.println(splitByUserCity(orderList));

    }


// ==============================================================================


    public static ArrayList<Order> deleteDuplicates(List<Order> inputList) {
        Set<Order> tempSet = new HashSet<>();
        tempSet.addAll(inputList);
        return new ArrayList<>(tempSet);
    }

    public static void printArrayList(List<Order> list) {
        System.out.println("ArrayList");
        for (Order order : list) {
            System.out.println(order.toString());
        }
        System.out.println("");
    }


    public static ArrayList<Order> filterByLowestPrice(List<Order> inputList) {
        ArrayList<Order> resultList = new ArrayList<>();
        int index = 0;
        int lowestPrice = 1500;
        for (Order order : inputList) {
            if (order.getPrice() >= lowestPrice) {
                resultList.add(index, order);
                index++;
            }
        }
        return resultList;
    }


    public static Map<String, List<Order>> splitByCurrency(List<Order> inputList) {
        Map<String, List<Order>> resultMap = new TreeMap<>();
        List<Order> listUSD = new ArrayList<>();
        List<Order> listUAH = new ArrayList<>();
        for (Order order : inputList) {
            if (order.getCurrency().equals(Currency.getInstance("USD"))) {
                listUSD.add(order);
            }
            if (order.getCurrency().equals(Currency.getInstance("UAH"))) {
                listUAH.add(order);
            }
        }
        resultMap.put("USD", listUSD);
        resultMap.put("UAH", listUAH);
        return resultMap;
    }

    public static Map<String, List<Order>> splitByUserCity(List<Order> inputList) {
        Map<String, List<Order>> resultMap = new TreeMap<>();
        Set<String> citySet = new HashSet<>();
        for (Order order : inputList) {
            citySet.add(order.getUser().getCity());
        }
        for (String city : citySet) {
            List<Order> tempList = new ArrayList<>();
            for (Order order : inputList) {
                if (city.equals(order.getUser().getCity()))
                    tempList.add(order);
            }
            resultMap.put(city, tempList);
        }
        return resultMap;
    }
}
