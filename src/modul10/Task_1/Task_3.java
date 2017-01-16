package modul10.Task_1;

/**
 * Created by Семья on 16.01.2017.
 */
public class Task_3 {

    public static void main(String[] args) {

        String q = null;

        try {
            throw new NullPointerException("My NullPointerException");
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(q);
        }
    }
}
