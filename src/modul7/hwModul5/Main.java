package modul7.hwModul5;

import java.util.ArrayList;

/**
 * Created by Семья on 19.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println("Проверка поиска с пустыми параметрами, получаем все номера из всех баз:");
        ArrayList<Room> foundRooms= controller.requstRooms(0,0,"","");
        for (Room r: foundRooms) System.out.println(r);
        System.out.println();

        System.out.println("Ищем все номера во Львове:");
        foundRooms = controller.requstRooms(0,0,"Львов","");
        for (Room r: foundRooms) System.out.println(r);
        System.out.println();

        System.out.println("Ищем все номера во Львове на 3-х персон:");
        foundRooms = controller.requstRooms(0,3,"Львов", "");
        for (Room r: foundRooms) System.out.println(r);
        System.out.println();

        System.out.println("Проверяем совпадающие номера в BookingComAPI и TripAdvisorAPI:");
        ArrayList<Room> dupl = controller.check(new BookingComAPI(), new TripAdvisorAPI());
        for (Room r: dupl) System.out.println(r);
        System.out.println();

        System.out.println("Проверяем совпадающие номера в BookingComAPI и GoogleAPI:");
        dupl = controller.check(new BookingComAPI(), new GoogleAPI());
        for (Room r: dupl) System.out.println(r);
        System.out.println("(тут нет совпадений)");
        System.out.println();

        System.out.println("Проверяем совпадающие номера в TripAdvisorAPI и GoogleAPI:");
        dupl = controller.check(new TripAdvisorAPI(), new GoogleAPI());
        for (Room r: dupl) System.out.println(r);
        System.out.println();
    }
}
