package modul2.Homework;

/**
 * Created by Семья on 07.11.2016.
 */
public class Bank {
    public static void main(String[] args) {

    }

    public static double withdraw(double balance, double transaction) {
        double commision = transaction * 0.05;
        double total = transaction + commision;
        if (total >  balance)
            System.err.println("NO");
        else {
            balance =  balance - total;
            System.out.println("OK " + commision + " " +  balance);
        }
        return  balance;
    }
}

