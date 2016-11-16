package modul2.modul3.objectexample.Homework.Homework3;

/**
 * Created by Семья on 14.11.2016.
 */
public class Student {
    public static void main(String[] args) {

    }



    private String lastName;
    private String firstName;
    private int group;
    private Course[] coursesTaken;
    private int age;







    public Student(String firstName, String lastName,  int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String firstName, Course[] coursesTaken) {
        this.firstName = firstName;
        this.coursesTaken = coursesTaken;


    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    }


