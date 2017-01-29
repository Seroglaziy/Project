package modul7.compare;

import modul7.Task1.entities.Order;

import java.util.Comparator;

/**
 * Created by Семья on 29.01.2017.
 */
public class PriceComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        return price2 - price1;
    }
}
