package modul9.Task9_1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Семья on 07.01.2017.
 */
public class Main {

    public static void main(String[] args) {


        List<Order> list = Utils.createOrders();
        List<Order> list2 = Utils.createOrders();
        List<Order> list3 = Utils.createOrders();


        System.out.println("=========================Сортируем списки=====================================");

        List<Order> sortedPriceDec = list.stream().sorted((d1, d2) -> d2.getPrice() - d1.getPrice()).collect(Collectors.toList());
        System.out.println("Sort list by Price decrease " + sortedPriceDec);
        System.out.println();


        List<Order> sortedPriceInc = list.stream().sorted((d1, d2) -> d1.getPrice()!=d2.getPrice()?d1.getPrice()-d2.getPrice():d1.getUser().getCity().compareTo(d2.getUser().getCity())).collect(Collectors.toList());
        System.out.println("Sort list by Price increase and City " + sortedPriceInc);
        System.out.println();


        list.sort(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator).thenComparing((o1, o2)->o1.getUser().getCity().compareTo(o2.getUser().getCity())));
        System.out.println("Sort by ItemANDShopANDCity " + list);

        System.out.println();
        System.out.println("============================== Удаляем дубликаты ==========================================================================");
        System.out.println();


        List<Order> withoutDP = Utils.removeDuplicates(list);
        System.out.println("List without duplicates" + withoutDP);


        System.out.println();
        System.out.println("============================== Less 1500 ==========================================================================");
        System.out.println();

        List<Order> pd=Utils.removeLess(list, 1500);
        System.out.println(pd);

        System.out.println();
        System.out.println("============================ Разделяем на списки =====================================================================");
        System.out.println();


        Map<Currency, List<Order>> curr = Utils.splitByCurrency(list2);
        curr.entrySet().forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        Map<String, List<Order>> cityMap = Utils.splitByCity(list3);
        cityMap.entrySet().forEach(System.out::println);

        System.out.println();
        System.out.println("============================== Работаем с TreeSet =========================================================");
        System.out.println();


        List<Order> listWithDP = Utils.createOrdersWithDuplicates();
        NavigableSet<Order> set = new TreeSet<>();

        set.addAll(listWithDP);
        Order or = new Order(4444, 1111, Currency.EUR, "ssf", "dfsf", new User(444, "dad", "Petrov", "asd", 2555));
        set.add(or);

        System.out.println(Utils.checkContains(set, "Petrov"));
        System.out.println();

        System.out.println("The Order with largest price is: "+Utils.largestPrice(set));
        set = Utils.deleteUSD(set);
        set.forEach(System.out::println);
        System.out.println();

    }
}
