package modul2.modul3.objectexample.Homework.Homework3;

/**
 * Created by Семья on 14.11.2016.
 */
public class SpecialStudent extends CollegeStudent {


    private long secretKey;
    private String email;


    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, long secretKey, String email) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
        this.email = email;
    }






    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

//public SpecialStudent(String firstName, String lastName, int i) {
        //super(firstName , lastName , i);














