package modul5;

import java.util.ArrayList;
import java.util.Date;

public class BookingComAPI implements API {
    public static void main(String[] args) {

    }

    private ArrayList<Room> bookingComRooms;

    public BookingComAPI() {
        this.bookingComRooms = new ArrayList<>();
        this.bookingComRooms.add(new Room(11, 200, 4, new Date(), "Hayat", "Kiev"));
        this.bookingComRooms.add(new Room(22, 250, 1, new Date(), "Ukraine", "Kiev"));
        this.bookingComRooms.add(new Room(33, 1500, 8, new Date(), "Radisson", "Lviv"));
        this.bookingComRooms.add(new Room(44, 300, 3, new Date(), "Ace hotel", "NY City"));
        this.bookingComRooms.add(new Room(55, 500, 5, new Date(), "The Roosevelt Hotel", "Boston"));

    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> requiredRooms = new ArrayList<>();
        for (Room requiredRoom : this.bookingComRooms) {
            if (requiredRoom.getPrice() == price && requiredRoom.getPersons() == persons
                    && requiredRoom.getCityName().equals(city) && requiredRoom.getHotelName().equals(hotel)) {
                requiredRooms.add(requiredRoom);
            }
        }
        return requiredRooms;
    }

    @Override
    public ArrayList<Room> getAll() {
        return bookingComRooms;


    }
}

   /* public Room[] rooms;


    public BookingComAPI() {
        Date date = new Date();
        rooms = new Room[5];
        rooms[0] = new Room(963852741, 150, 1, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[1] = new Room(365552, 250, 2, date, "Burj Al Arab", "Дубай");
        rooms[2] = new Room(36012, 150, 2, date, "KharkivPalace", "Kharkiv");
        rooms[3] = new Room(126, 150, 2, date, "Hilton", "New York");
        rooms[4] = new Room(22543, 150, 2, date, "Universal's Cabana Bay Beach Resort", "Орландо");

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] booking = new Room[0];
        Date date=new Date();
        Room compareRoom= new Room(236544,price,persons,date,hotel,city);
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(compareRoom)){
                Room[] Same1 = new Room[booking.length + 1];
                System.arraycopy(booking, 0, Same1, 0, booking.length);
                booking = Same1;
                booking[booking.length - 1] = rooms[i];
            }
        }
        return booking;
    }

    @Override
    public Room[] getAll() {
        return this.rooms;
    }*/
