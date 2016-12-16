package modul5;


import java.util.ArrayList;

public class Controller {

        private ArrayList<API> apis;

        private DAOImpl dao = new DAOImpl();

    public Controller() {
            this.apis = apis;
        }



    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {
            ArrayList<Room> foundedRooms = new ArrayList<>();
            for (API apitoProceed : apis){
                foundedRooms.addAll(apitoProceed.findRooms(price, persons, city, hotel));
            }


            return foundedRooms;
        }

        public ArrayList<Room> check(API api1, API api2) {
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

    public DAOImpl getDao() {
        return dao;
    }
}
