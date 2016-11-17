package modul2.modul3.objectexample.Homework.Task3;

import java.util.Date;

/**
 * Created by Семья on 14.11.2016.
 */
public class Course {
    public static void main(String[] args) {


    }



    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;


    public Course(int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }


    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }








    }


