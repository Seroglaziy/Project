package Task4_1;

import Task4_1.Bank;

import java.util.Currency;

/**
 * Created by Семья on 19.11.2016.
 */
public abstract class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}




