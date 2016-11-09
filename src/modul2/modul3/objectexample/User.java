package modul2.modul3.objectexample;

/**
 * Created by Семья on 09.11.2016.
 */
public class User {
    //Все что касается пользователя
    public String name = "Vadim";
    public int balance = 2000;
    public int monthsOfEmployment = 9;
    public String companyName = "Next";
    public int salary = 1000;
    public String currency = "USD";


    public User() {

    }


    //конструктор
    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    //методы
    void paySalary() {
        System.out.println("добавляет заработную плату к балансу пользователя");
    }


    public void withdraw() {
        System.out.println("снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях");
    }

    public void companyName() {
        System.out.println("вычисляет длину имя компании");

    }

    public void monthIncreaser() {
        System.out.println("увеличивает monthsOfEmployment на addMonth");
    }


    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }









    }







