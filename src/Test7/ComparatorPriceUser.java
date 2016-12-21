package Test7;


import java.util.Comparator;

/**
 * Created by Семья on 19.12.2016.
 */
public class ComparatorPriceUser implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        }
        else
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }


    }



