package modul2.modul3.objectexample.Homework.Task4;

/**
 * Created by Семья on 16.11.2016.
 */
        public class User1 {

    public static void main(String[] args) {

    }


    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;





    public void paySalary() {
         balance = balance + salary;
         System.out.println(balance);





    }
    public void withdraw(int sum) {
        int commision = 0;
        if (sum < 1000)
            commision = 5;
       else {
            commision = 10;


        }
        balance = balance - (sum + (sum * commision));


    }
    public int companyNameLenght(){
        return companyName.length();
    }
    int monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
        return monthsOfEmployment;
    }


    public User1(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
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
    public double getBalance() {
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