package modul5;

import modul5.API.API;
import modul5.API.BookingComAPI;
import modul5.API.GoogleAPI;
import modul5.API.TripAdvicorAPI;
import modul5.Controller.Controller;

import java.util.ArrayList;

/**
 * Created by Семья on 29.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<API> apisArray = new ArrayList<>();
        apisArray.add(new BookingComAPI());
        apisArray.add(new GoogleAPI());
        apisArray.add(new TripAdvicorAPI());
        Controller controller = new Controller(apisArray);

        System.out.println(controller.requestRooms(200, 4, "Kiev", "Hayat"));
        System.out.println(controller.requestRooms(570, 3, "Ternopil", "Zirka"));
        System.out.println(controller.requestRooms(200, 1, "Lviv", "Radisson"));

        System.out.println(controller.check(apisArray.get(0), apisArray.get(1)));
        System.out.println(controller.check(apisArray.get(0), apisArray.get(2)));
        System.out.println(controller.check(apisArray.get(1), apisArray.get(2)));
    }
}
