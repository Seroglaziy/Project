package modul7.Compare;



import modul7.Order;

import java.util.Comparator;

/**
 * Created by Семья on 23.12.2016.
 */
public class PriceComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        return price2-price1;
    }
}
