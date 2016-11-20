package modul2.modul3.objectexample.Homework.Task4;

/**
 * Created by Семья on 18.11.2016.
 */
public class User {


    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public void paySalary() {
        int paySalary = balance + salary;
        System.out.println(paySalary);
    }
    public double withdraw(int sum) {
        double comis1 = 0.05, comis2 = 0.1;
        if (sum < 1000) {
            return balance = (int) (getBalance() - (sum + (sum * comis1)));
        } else {
            return balance = (int) (getBalance() - (sum + (sum * comis2)));
        }
    }
    public void companyNameLength() {
        System.out.println(companyName.length());
    }
    public void monthIncreaser(int addMonth) {
        monthOfEmployment = monthOfEmployment + addMonth;
        System.out.println(monthOfEmployment);
    }
    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }
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
    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }
    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
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


