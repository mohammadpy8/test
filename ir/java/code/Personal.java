package ir.java.code;

import java.util.*;

/**
 * @author mohammad
 * @see java
 */
public class Personal {
    public static void main(String[] args) {

    }

    public Personal(String name, String id) {
        this.name = name;
        this.id = id;
    }

    private String name;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    public static void main(String[] args) {

    }

    private int salary;
    private Date birthday;

    public void setName(String name) {

    }

    public Date getBirthday() {
        return birthday;
    }

    public int getSalary() {
        return salary;
    }
}

class Shape {
    public static void main(String[] args) {

    }

    int color;
    int positionX, positiobY;
}

class Circle extends Shape {
    public static void main(String[] args) {

    }

    private int radius;

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    public static void main(String[] args) {

    }

    private int width, lenght;

    public double getArea() {
        return width * lenght;
    }
}

class Person {
    private String name;
    private long nantioalID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNantioalID() {
        return nantioalID;
    }

    public void setNantioalID(long nantioalID) {
        this.nantioalID = nantioalID;
    }

    public void show() {
        System.out.println("Person: name" + name + ",nantioalID=" + nantioalID);
    }
}

class Student extends Person {
    public static void main(String[] args) {

    }

    private String studentID;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void takeCourses(String courses) {
        System.out.println(courses);
    }

    public void show() {
        System.out.println("Student: name=" + getName() + ",nantioalID" + getNantioalID());
    }
}
