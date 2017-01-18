package modul7.Task1.entities;

import java.util.Currency;


public class Order implements Comparable<Order> {
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (price != order.price) return false;
        if (currency != null ? !currency.equals(order.currency) : order.currency != null) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        if (shopIdentificator != null ? !shopIdentificator.equals(order.shopIdentificator) : order.shopIdentificator != null)
            return false;
        return user != null ? user.equals(order.user) : order.user == null;

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (shopIdentificator != null ? shopIdentificator.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("modul7.Task1.entities.Order{");
        sb.append("price=").append(price);
        sb.append(", currency=").append(currency);
        sb.append(", itemName='").append(itemName).append('\'');
        sb.append(", shopIdentificator='").append(shopIdentificator).append('\'');
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Order o) {
        return o.getPrice() - this.price;
    }

}