package modul4.Task4_2.Task4_1;

/**
 * Created by Семья on 21.11.2016.
 */
public interface BankSystem  {


    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);

}
