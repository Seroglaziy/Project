package modul7.hwModul5;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Семья on 19.01.2017.
 */
public class TripAdvisorAPI implements API {

    ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(3010, 500, 2, new GregorianCalendar(2016, 11, 23).getTime(), "Солнышко", "Киев"));
        rooms.add(new Room(3012, 500, 2, new GregorianCalendar(2016, 11, 27).getTime(), "Радуга", "Киев"));
        rooms.add(new Room(3013, 500, 2, new GregorianCalendar(2016, 10, 23).getTime(), "Волна", "Одесса"));
        rooms.add(new Room(3014, 600, 2, new GregorianCalendar(2016, 11, 15).getTime(), "Десна", "Сумы"));
        rooms.add(new Room(3015, 600, 3, new GregorianCalendar(2016, 11, 02).getTime(), "Тризуб", "Львов"));
    }
    //Тут код дублируется для разных реализаций API, но оставляю как есть, не выношу его в какой-либо абстрактный класс,
    // так как подразумевается, что у разных баз данных своя реализация поиска
    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> found = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            // Если название отеля/города пустая строка, или 0 для кол-ва персон, то в выборку попадают
            // объекты независимо от этого параметра
            if ((rooms.get(i).getPrice() <= price || price==0) && (persons == 0 || persons == rooms.get(i).getPersons())
                    &&(city == "" || rooms.get(i).getCityName() == city ) && (hotel == "" || hotel == rooms.get(i).getHotelName())) {
                found.add(rooms.get(i));
            }
        }
        return found;
    }
}
