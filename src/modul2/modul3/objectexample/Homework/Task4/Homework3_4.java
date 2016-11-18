package modul2.modul3.objectexample.Homework.Task4;

/**
 * Created by Семья on 18.11.2016.
 */
public class Homework3_4 {
    public static void main(String[] args) {
        User user1 = new User("Vadim", 5000, 6, "Luxoft", 2000, "usd");
        user1.paySalary(2000, 5000);
        System.out.println(user1.withdraw(1000));
        user1.monthIncreaser(2);
        System.out.println(user1.getBalance());

        System.out.println(user1.withdraw(2000));
    }

}


