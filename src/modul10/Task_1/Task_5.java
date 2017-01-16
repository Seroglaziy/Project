package modul10.Task_1;



import modul10.Task_1.exception.MyException1;
import modul10.Task_1.exception.MyException2;
import modul10.Task_1.exception.MyException3;

import java.util.Random;

/**
 * Created by Семья on 16.01.2017.
 */
public class Task_5 {

     static void getException() throws Exception  {

         Random ran = new Random();
         int i = ran.nextInt(9);
         if(i % 3 == 0) {
             throw new MyException1();
         }if(i % 3 == 1){
             throw new MyException2();
         }if(i % 3 == 2){
             throw new MyException3();
         }

    }
}