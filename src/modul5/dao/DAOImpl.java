package modul5.dao;

import modul5.entities.Room;

import java.util.ArrayList;

/**
 * Created by Семья on 29.01.2017.
 */
public class DAOImpl implements DAO {
    private ArrayList<Room> roomsDB = new ArrayList<>();

    @Override
    public boolean save(Room room) {

        /*int index = 0;
        while (this.roomsDB[index] != null) {
            index++;
        }
        if (index < this.roomsDB.length) {
            this.roomsDB[index] = room;
            return this.roomsDB[index];
        } else {
            return null;
        }*/

        return this.roomsDB.add(room);
    }

    @Override
    public boolean delete(Room room) {

        //System.out.println("Room deleted: " + room.toString()); - initial condition for Task 5
        /*for (int i = 0; i < 10; i++) {
            if (roomsDB[i].equals(room)) {
                roomsDB = null;
                return true;
            }
        }
        return false;*/
        return this.roomsDB.remove(room);
    }

    @Override
    public Room update(Room room) {

        //System.out.println("Room updated: " + room.toString()); - initial condition for Task 5

        for (Room roomToUpdte : this.roomsDB) {
            if (roomToUpdte.getId() == room.getId()) {
                roomToUpdte = room;
                return roomToUpdte;
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {

        //System.out.println("Found room with id: " + id); - initial condition for Task 5

        for (Room roomsToFind : this.roomsDB) {
            if (roomsToFind.getId() == id) {
                return roomsToFind;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Room> getAll() {
        return this.roomsDB;
    }
}
