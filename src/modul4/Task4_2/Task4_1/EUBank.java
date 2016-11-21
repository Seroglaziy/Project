package modul4.Task4_2.Task4_1;

import modul4.Task4_2.Currency;
import modul4.Task4_2.Task4_1.Bank;

/**
 * Created by Семья on 21.11.2016.
 */
public class EUBank extends Bank {


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return 2000;
        else return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return 20000;
        else return 10000;
    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) return 0;
        else return 1;
    }

    @Override
    int getCommission(int amount) {
        if (this.getCurrency() == Currency.USD) {
            if (amount < 1000) return 5;
            else return 7;
        }
         else{
            if (amount < 1000) return 2;
            else return 4;
        }
    }
}