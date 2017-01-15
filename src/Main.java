

/**
 * Created by Семья on 14.01.2017.
 */
public class Main{
    public static void main(String[] args) {


        String one = args[2];


        try {
          if (args[2] == one) throw new RuntimeException();
         } catch (Exception e) {
            System.out.println("Exception");


        }finally {
            System.out.println("finally is completed");
        }

    }
}
