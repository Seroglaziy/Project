package modul7.compare;

import modul7.Task1.entities.Order;

import java.util.Comparator;

/**
 * Created by Семья on 29.01.2017.
 */
public class NameShopIDUserCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        String itemName1 = o1.getItemName();
        String itemName2 = o2.getItemName();
        String shopID1 = o1.getShopIdentificator();
        String shopID2 = o2.getShopIdentificator();
        String userCity1 = o1.getUser().getCity();
        String userCity2 = o2.getUser().getCity();

        if (!itemName1.equals(itemName2)) {
            return itemName1.compareTo(itemName2);
        } else if (!shopID1.equals(shopID2)) {
            return shopID1.compareTo(shopID2);
        } else {
            return userCity1.compareTo(userCity2);
        }
    }
}