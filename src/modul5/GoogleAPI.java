package modul5;

/**
 * Created by Семья on 23.11.2016.
 */
public  class GoogleAPI implements API {


    public GoogleAPI(Room[]rooms){
        this.rooms = rooms;
    }

    Room[] rooms = new Room[5];


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
