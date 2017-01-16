package modul10.Task_1.exception;

/**
 * Created by Семья on 16.01.2017.
 */
public class MyException1 extends Exception {

     String message;

    public MyException1(String message, String message1) {
        super(message);
        this.message = message1;
    }


    public MyException1(){

    }

    @Override
    public String getMessage() {
        return message;
    }
}
