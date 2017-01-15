package modul10.Task_1;

/**
 * Created by Семья on 14.01.2017.
 */
public class Main {
    public static void main(String[] args){





        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());


        } finally {
            System.out.println("finally is completed");
        }
    }

}

