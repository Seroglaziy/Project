package Test7;

import java.util.Comparator;

/**
 * Created by Семья on 19.12.2016.
 */
public class ComparatorItemIDCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (!o1.getItemName().equals(o2.getItemName())) {
            return o1.getItemName().compareTo(o2.getItemName());
        } else if (o1.getId() != o2.getId()) {
            return (int) (o1.getId() - o2.getId());
        } else
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }

}
