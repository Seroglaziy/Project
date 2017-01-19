package modul7.hwModul5;



import java.util.ArrayList;

/**
 * Created by Семья on 19.01.2017.
 */
public class Controller {

    private ArrayList<API> apis = new ArrayList<>();
    {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    ArrayList<Room> requstRooms(int price, int persons, String city, String hotel){
        ArrayList<Room> rooms = new ArrayList<>();
        for (API api: apis){
            rooms.addAll(api.findRooms(price,persons,city,hotel));
        }
        return rooms;
    }

    ArrayList<Room> check(API api1, API api2){
        ArrayList<Room> rooms = api1.findRooms(0,0,"","");
        rooms.addAll(api2.findRooms(0,0,"",""));
        ArrayList<Room> duplicated = new ArrayList<>();
        for (int i = 0; i < rooms.size() ; i++) {
            for (int j = i+1; j < rooms.size(); j++) {
                if (rooms.get(i).equals(rooms.get(j))) duplicated.add(rooms.get(i));
            }
        }
        return duplicated;
    }
}
