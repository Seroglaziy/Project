package modul7.hwModul5;

import java.util.ArrayList;

/**
 * Created by Семья on 19.01.2017.
 */
public class DAOimpl implements DAO {
    @Override
    public ArrayList<Room> save(ArrayList<Room> rooms, Room room) {
        rooms.add(room);
        return rooms;
    }

    @Override
    public ArrayList<Room> delete(ArrayList<Room> rooms, long id) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getId() == id) {
                rooms.remove(i);
                return rooms;
            }
        }
        return rooms;
    }

    @Override
    public ArrayList<Room> update(ArrayList<Room> rooms, Room room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getId() == room.getId()) {
                rooms.set(i, room);
                return rooms;
            }
        }
        return rooms;
    }

    @Override
    public Room findById(ArrayList<Room> rooms, long id) {
        for (Room r : rooms) {
            if (r.getId() == id) return r;
        }
        return null;
    }
}

