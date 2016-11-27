package modul5;

import java.util.Date;

/**
 * Created by Семья on 23.11.2016.
 */
public  class GoogleAPI implements API {


    public Room[] rooms;

    public GoogleAPI() {
        rooms = new Room[5];
        Date date = new Date();
        rooms[0] = new Room(250 , 350 , 450 , date , "Mirrors Design Hotel" , "Киев");
        rooms[1] = new Room(350 , 450 ,550 , date , "Салют" , "Киев");
        rooms[2] = new Room(450 , 550 , 650 , date , "Знание", "Киев");
        rooms[3] = new Room(550, 650 , 750 , date ,"Сити Парк Отель" , "Киев");
        rooms[4] = new Room(650, 750 , 850 , date ,"Отель Бонтиак" , "Киев");

    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}

