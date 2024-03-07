package main;

import java.util.*;

public class Containers {
    public static void main(String[] args) {
        ArrayList stu = new ArrayList();
        stu.add(10);
        stu.add("11");
        stu.add(new Object());
        stu.remove(0);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student("alireza"));
        student.add(new Student("mohammad"));
        student.remove(1);
        Student students = student.get(0);
        System.out.println(students);
        ArrayList<String> names = new ArrayList<String>();
        names.add("alireza");
        names.add("mohammad");
        String name = names.get(1);
        System.out.println(name);
    }
}

class ListClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit"))
                break;
            list.add(input);
        }
        if (list.isEmpty()) {
            System.out.println("No String entered");
        } else {
            System.out.println(list.size());
            if (list.contains("Ali"))
                System.out.println("Ali founded");
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
    void AddToList() {
        String[] strings = {"m", "a", "b"};
        ArrayList<String> list = new ArrayList<String>();
        for(String str : strings) {
            list.add(str);
        }
    }
}
