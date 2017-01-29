package modul5.Controller;

import modul5.API.API;
import modul5.dao.DAOImpl;
import modul5.entities.Room;

import java.util.ArrayList;

/**
 * Created by Семья on 29.01.2017.
 */
public class Controller {

    private ArrayList<API> apis;

    private DAOImpl dao = new DAOImpl();

    public Controller(ArrayList<API> apis) {
        this.apis = apis;
    }

    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> foundedRooms = new ArrayList<>();
        for (API apitoProceed : apis){
            foundedRooms.addAll(apitoProceed.findRooms(price, persons, city, hotel));
        }

        /*int allApisLength = 0;
        for (API apiToProceed : apis) {
            allApisLength += apiToProceed.getAll().length;
        }
        Room[] tempArray = new Room[allApisLength];
        int foundedRoomsNumber = 0;
        for (API apitoToProceed : apis) {
            Room[] apiRooms = apitoToProceed.findRooms(price, persons, city, hotel);
            int lenSource = apiRooms.length;
            System.arraycopy(apiRooms, 0, tempArray, foundedRoomsNumber, lenSource);
            foundedRoomsNumber += lenSource;
        }
        Room[] foundedRooms = new Room[foundedRoomsNumber];
        System.arraycopy(tempArray, 0, foundedRooms, 0, foundedRoomsNumber);*/

/*        Room[] foundedRooms = new Room[0];
        for (API apiToProceed : apis) {
            Room[] apiRooms = apiToProceed.findRooms(price, persons, city, hotel);
            int lenSource = apiRooms.length;
            int lenDest = foundedRooms.length;
            Room[] tempArray = new Room[lenDest + lenSource];
            System.arraycopy(apiRooms, 0, tempArray, lenDest, lenDest);
            foundedRooms = tempArray;
        }*/
        return foundedRooms;
    }

    public ArrayList<Room> check(API api1, API api2) {
        /*Room[] api1Rooms = api1.getAll();
        Room[] api2Rooms = api2.getAll();
        Room[] tempArray = new Room[api1Rooms.length + api2Rooms.length];
        int repeatedRoomsCount = 0;
        for (Room api1Room : api1Rooms) {
            for (Room api2Room : api2Rooms) {
                if (api1Room.equals(api2Room)) {
                    tempArray[repeatedRoomsCount] = api2Room;
                    repeatedRoomsCount++;
                }
            }
        }
        Room[] repeatedRooms = new Room[repeatedRoomsCount];
        System.arraycopy(tempArray, 0, repeatedRooms, 0, repeatedRoomsCount);*/
        ArrayList<Room> repeatedRooms = new ArrayList<>();
        for (Room room : api1.getAll()) {
            if(api2.getAll().contains(room)){
                repeatedRooms.add(room);
            }
        }
        return repeatedRooms;
    }

    public boolean save(Room room) {
        return dao.save(room);
    }

    public boolean delete(Room room) {
        return dao.delete(room);
    }

    public Room update(Room room) {
        return dao.update(room);
    }

    public Room findById(long id) {
        return dao.findById(id);
    }
}
