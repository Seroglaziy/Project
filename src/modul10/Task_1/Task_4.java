package modul10.Task_1;

import modul10.Task_1.exception.MyException1;
import modul10.Task_1.exception.MyException2;

/**
 * Created by Семья on 16.01.2017.
 */
public class Task_4 {

    public static void main(String[] args) {

        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");

        }

    }

    private static void g() throws Exception{
        throw new MyException2();
    }


    private static void f() throws Exception{
        try {
            g();
        }catch (Exception e){
            throw new MyException1("msg" , "print me");

        }
    }
}
