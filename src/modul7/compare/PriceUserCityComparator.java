package modul7.compare;

import modul7.Task1.Order;

import java.util.Comparator;

/**
 * Created by Семья on 16.12.2016.
 */
public class PriceUserCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        String city1 = o1.getUser().getCity();
        String city2 = o2.getUser().getCity();
        if (price1 != price2) {
            return price1 - price2;
        } else {
            return city1.compareTo(city2);
        }
    }
}