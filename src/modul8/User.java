package modul8;

/**
 * Created by Семья on 30.12.2016.
 */
public class User {

    private static long idVar = 1;
    private long id;
    private String name;

    public User(String name) {
        this.name = name;
        id = idVar;
        idVar++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id == user.id;

    }


    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
    //+++
    @Override
    public String toString() {
        return "{" + name + "}";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;

    }
}