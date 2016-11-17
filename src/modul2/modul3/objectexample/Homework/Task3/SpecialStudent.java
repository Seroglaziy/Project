package modul2.modul3.objectexample.Homework.Task3;

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

    public SpecialStudent(String firstName, String lastName,  long secretKey, String collegeName, int group, int rating ,long id) {
        super(firstName, lastName, group, collegeName, rating , id);
        this.secretKey = secretKey;

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














