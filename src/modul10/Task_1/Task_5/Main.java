package modul10.Task_1.Task_5;

import java.util.Random;

/**
 * Created by Семья on 29.01.2017.
 */
public class Main {
    static void throwsExceptions() throws FirsException, SecondException, ThirdException {
        switch (new Random().nextInt(3)) {
            case 0:
                throw new FirsException();
            case 1:
                throw new SecondException();
            case 2:
                throw new ThirdException();
        }
    }

    public static void main(String[] args) {
        try {
            throwsExceptions();
        } catch (FirsException | SecondException | ThirdException e) {
            System.out.println("Перехватили такое исключение: " + e);
        }
    }
}
