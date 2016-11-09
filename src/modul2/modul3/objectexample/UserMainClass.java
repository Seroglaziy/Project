package modul2.modul3.objectexample;

/**
 * Created by Семья on 09.11.2016.
 */
public class UserMainClass {
    public static void main(String[] args) {

        User user = new User();

        //sout Пользователя
        System.out.println(user.name);
        System.out.println(user.balance);
        System.out.println(user.monthsOfEmployment);
        System.out.println(user.companyName);
        System.out.println(user.salary);
        System.out.println(user.currency);
        System.out.println(" ");

        //метод
        user.paySalary();
        user.withdraw();
        user.companyName();
        user.monthIncreaser();



    }

}


