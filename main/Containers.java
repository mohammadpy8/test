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
        for (String str : strings) {
            list.add(str);
        }
    }
}

class Linked {
    public static void main(String[] args) {
        LinkedList<Double> grades = new LinkedList<Double>();
        grades.add(18.5);
        grades.add(20.5);
        for (Double d : grades) {
            System.out.println(d);
        }
        List<String> list = new LinkedList<String>();
        list.add("Ali");
        list.add("Taghi");
        System.out.println(list.get(1));
    }
}

class RandomNumbers {
    public static void main(String[] args) {
        List<Double> list = new LinkedList<Double>();
        Random random = new Random();
        Object temp;
        for (int i = 0; i < 10000; i++) {
            temp = list.get(random.nextInt(list.size()));
        }
    }
}

class SetClasses {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("ali");
        set.add("mohammad");
        Set<String> newSet = new HashSet<String>();
        newSet.add("all");
        newSet.add("aaaa");
        newSet.add("mmm");
        newSet.add("l");
        System.out.println(newSet.size());
        for (String str : newSet) {
            System.out.println(str);
        }
    }
}

class CollectionList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(20);
        list.add(30);
        list.add(10);
        Object[] array = list.toArray();
        for (Object object : array) {
            Integer i = (Integer) object;
            System.out.println(i);
        }
        Integer[] array2 = list.toArray(new Integer[list.size()]);
        for (Integer i : array2)
            System.out.println(i);
        Integer[] array3 = list.toArray(new Integer[0]);
        for (Integer i : array3)
            System.out.println(i);
    }
}
