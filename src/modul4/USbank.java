package modul4;

import modul2.practic.*;

import java.util.Currency;

/**
 * Created by Семья on 19.11.2016.
 */
public abstract class USbank extends Bank{


    public USbank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
