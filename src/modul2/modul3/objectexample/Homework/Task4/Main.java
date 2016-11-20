package modul2.modul3.objectexample.Homework.Task4;

/**
 * Created by Семья on 20.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        User1 user1 = new User1("Vadim", 5000, 6, "Luxoft", 2000, "USD");
        user1.paySalary();
        System.out.println(user1.withdraw(1000));
        user1.monthIncreaser(2);
        user1.getBalance();
        System.out.println(user1.withdraw(2000));


    }
}
















