package modul5;

import java.util.ArrayList;

public class DAOImpl implements DAO{

    private ArrayList<Room> roomsDB = new ArrayList<>();

    @Override
    public boolean save(Room room) {
        return this.roomsDB.add(room);
    }

    @Override
    public boolean delete(Room room) {
        return this.roomsDB.remove(room);
    }

    @Override
    public Room update(Room room) {
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