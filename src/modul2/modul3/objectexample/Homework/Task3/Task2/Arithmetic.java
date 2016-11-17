package modul2.modul3.objectexample.Homework.Task3.Task2;

/**
 * Created by Семья on 10.11.2016.
 */
public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic arr = new Arithmetic();
        Adder add = new Adder();
        System.out.println(add.add(10, 15));
        System.out.println(add.check(113, 15));
    }

    public Integer add(Integer a, Integer b) {
        Integer sum = a + b;
        return sum;




    }
}












