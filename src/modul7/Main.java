package modul7;

import java.util.*;

/**
 * Created by Семья on 19.01.2017.
 */
public class Main {

    public static void main(String[] args) {

        User slava = new User(1, "Slava", "Makhinich", "Kiev", 10000);
        User vova = new User(2, "Vova", "Pupkin", "Kiev", 2000);
        User sveta = new User(3, "Sveta", "Vlasova", "Lviv", 3000);
        User ivan = new User(4, "Ivan", "Ivanov", "Lviv", 4000);
        User petr = new User(5, "Petr", "Petrov", "Dnepr", 5000);
        User nata = new User(6, "Nata", "Beliakova", "Dnepr", 6000);
        User pasha = new User(7, "Pasha", "Pavlov", "Dnepr", 7000);
        User andrey = new User(8, "Andrey", "Andreev", "Lviv", 8000);

        ArrayList<Order> orders= new ArrayList<>();

        orders.add(new Order(101, 2000, Currency.UAH, "Vacuum cleaner", "Shop1", slava));
        orders.add(new Order(101, 2000, Currency.UAH, "Vacuum cleaner", "Shop1", slava));
        orders.add(new Order(103, 2000, Currency.USD, "TV-set", "Shop2", vova));
        orders.add(new Order(103, 2000, Currency.USD, "TV-set", "Shop2", vova));
        orders.add(new Order(108, 333, Currency.USD, "Clock", "Shop3", sveta));
        orders.add(new Order(105, 1500, Currency.UAH, "Watch", "Shop1", ivan));
        orders.add(new Order(110, 1500, Currency.UAH, "Sofa", "Shop3", petr));
        orders.add(new Order(111, 1600, Currency.USD, "Sofa", "Shop1", pasha));
        orders.add(new Order(109, 1700, Currency.USD, "Table", "Shop3", andrey));
        orders.add(new Order(107, 222, Currency.UAH, "Lamp", "Shop4", nata));

        TreeSet<Order> orderSet =new TreeSet<>(orders);

        System.out.println("Task 2 - ArrayLisl");
        for (Order o: orders) System.out.println(o);
        System.out.println();

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println("Sorted by Order price in decrease order:");
        for (Order o: orders) System.out.println(o);
        System.out.println();

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int priceCompare = o1.getPrice() - o2.getPrice();
                if (priceCompare !=0) return priceCompare;
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        System.out.println("Sorted by Order price in increase order and User city:");
        for (Order o: orders) System.out.println(o);
        System.out.println();

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int compareItemName = o1.getItemName().compareTo(o2.getItemName());
                if (compareItemName != 0) return compareItemName;
                int compareShop = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (compareShop != 0) return compareShop;
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        System.out.println("Sorted by Order itemName and ShopIdentificator and User city");
        for (Order o: orders) System.out.println(o);
        System.out.println();

        System.out.println("Delete duplicates:");
        orders = new ArrayList<>(new HashSet<>(orders));
        for (Order o: orders) System.out.println(o);
        System.out.println();

        System.out.println("Delete items where price less than 1500");
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getPrice() < 1500) {
                orders.remove(i);
                i--;
            }
        }
        for (Order o: orders) System.out.println(o);
        System.out.println();

        System.out.println("Separate list for two list - orders in USD and UAH");
        ArrayList <Order> ordersUSD= new ArrayList<>();
        ArrayList <Order> ordersUAH= new ArrayList<>();
        for (Order o: orders){
            if (o.getCurrency() == Currency.USD) ordersUSD.add(o);
            if (o.getCurrency() == Currency.UAH) ordersUAH.add(o);
        }
        System.out.println("Orders in USD:");
        for (Order o: ordersUSD) System.out.println(o);
        System.out.println("Orders in UAH:");
        for (Order o: ordersUAH) System.out.println(o);
        System.out.println();

        System.out.println("Separate list for as many lists as many unique cities are in User");
        List<Order> ordersKiev = new ArrayList<>();
        List <Order> ordersLviv = new ArrayList<>();
        List <Order> ordersDnepr = new ArrayList<>();
        for (Order o: orders){
            if (o.user.getCity() == "Kiev") ordersKiev.add(o);
            if (o.user.getCity() == "Lviv") ordersLviv.add(o);
            if (o.user.getCity() == "Dnepr") ordersDnepr.add(o);
        }
        System.out.println("Dnepr:");
        for (Order o: ordersDnepr) System.out.println(o);
        System.out.println("Kiev:");
        for (Order o: ordersKiev) System.out.println(o);
        System.out.println("Lviv:");
        for (Order o: ordersLviv) System.out.println(o);
        System.out.println();

        System.out.println("Task 3 - TreeSet");
        for (Order o: orderSet) System.out.println(o);
        System.out.println();

        System.out.println("Check if set contain Order where User’s lastName is - “Petrov”:");
        for (Order o: orderSet){
            if (o.getUser().getLastName() == "Petrov") System.out.println(o);
        }
        System.out.println();

        System.out.println("Print Order with largest price using only one set method - get:");

        // Так как моя коллекция отсортирована по возрастанию цены, мне достаточно взять последний элемент
        System.out.println(orderSet.last());
        System.out.println();

        System.out.println("Delete orders where currency is USD using Iterator:");
        Iterator <Order> iterator = orderSet.iterator();
        TreeSet<Order> ordersWithoutUSD = new TreeSet<>();
        Order tempOrder;
        while (iterator.hasNext()){
            tempOrder = iterator.next();
            if (tempOrder.getCurrency() != Currency.USD) ordersWithoutUSD.add(tempOrder);
        }
        for (Order o: ordersWithoutUSD) System.out.println(o);
    }
}
