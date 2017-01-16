package modul10.Task_1;

/**
 * Created by Семья on 16.01.2017.
 */
public class Task_2 {

    public static void main(String[] args) {

        try {
            throw new IllegalAccessException("cause1 ,my string");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("IllegalAccessException");
        }

    }
}
