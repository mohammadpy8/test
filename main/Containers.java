package main;

import java.util.*;
import java.lang.*;

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

class Students {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<Students>();
        list.add(new Students("alireza"));
        System.out.println(list.contains(new Students("alireza")));
        System.out.println("------------");
        Set<Students> set = new HashSet<Students>();
        set.add(new Students("m"));
        System.out.println(set.contains(new Students("m")));
    }

    private String name;

    public Students(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        Students other = (Students) obj;
        return name.equals(other.name);
    }

    public int hashCode() {
        return 31 + ((name == null) ? 0 : name.hashCode());
    }
}

class Rectangle {
    public static void main(String[] args) {

    }

    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}

class RectangleShape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println(r1.equals(r2));
        List<Rectangle> list = new ArrayList<Rectangle>();
        list.add(r1);
        System.out.println("--------");
        System.out.println(list.contains(r2));
    }
}

class MapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "alireza");
        map.put(20, "mohammad");
        map.put(30, "ahmad");
        String name = map.get(10);
        System.out.println(name);
        System.out.println("-----------");
        MapClass e = new MapClass();
        e.E();
    }

    void E() {
        Map<Students, Double> map = new HashMap<Students, Double>();
        map.put(new Students("m"), 15.5);
        map.put(new Students("f"), 10.0);
        map.put(new Students("d"), 1.5);
        map.put(new Students("a"), 24.2);
        Double grade = map.get(new Students("a"));
        System.out.println("grade of =" + grade);
        System.out.println(map.size());
        for (Students students : map.keySet()) {
            System.out.println(students.toString());
        }
        Double totalSum = 0.0;
        for (Double avg : map.values()) {
            totalSum += avg;
        }
        System.out.println(totalSum);
        System.out.println("Avg= " + (totalSum / map.size()));
    }
}

class Iterators {
    public static void main(String[] args) {
        List<Integer> list = null;
        for (Integer i : list) {
            System.out.println(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
    }

    void Modifier() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer integer : list)
            if (integer.equals(1))
                list.remove(integer);
        List<String> newList = new ArrayList<String>();
        newList.add("A");
        newList.add("B");
        newList.add("C");
        for (String s : newList)
            if (s.equals("A"))
                newList.remove(s);

    }
}

interface Comparator<T> {
    int compare(T o1, T o2);
}

class Teacher implements Comparable<Teacher> {
    int age;
    double grade;

    public int compareTo(Teacher s) {
        return (this.grade < s.grade ? -1 : (this.grade == s.grade ? 0 : +1));
    }

    public Teacher(int age, int grade) {
        this.age = age;
        this.grade = grade;
    }
}

class StudentComparator implements java.util.Comparator<Teacher> {
    public static void main(String[] args) {
        StudentComparator comparator = new StudentComparator();
        Teacher s1 = new Teacher(21, 18);
        Teacher s2 = new Teacher(20, 17);
        System.out.println(s1.compareTo(s2));
        System.out.println(comparator.compare(s1, s2));
    }

    public int compare(Teacher s1, Teacher s2) {
        return s1.age < s2.age ? -1 : (s1.age == s2.age ? 0 : +1);
    }
}

class UseArray {
    public static void main(String[] args) {
        Random random = new Random();
        Long[] array = new Long[100];
        Arrays.fill(array, 5L);
        Long[] copy = Arrays.copyOf(array, 200);
        for (int i = 100; i < copy.length; i++) {
            copy[i] = random.nextLong() % 10;
        }
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Long> asList2 = Arrays.asList(array);
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, 7L);
        System.out.println(index);
        System.out.println(asList2);
        System.out.println(asList);
        UseArray use = new UseArray();
        use.ArrayUseful();
        use.Coll();
    }

    public void ArrayUseful() {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};
        System.out.println(a1 == a2);  ///false result
        System.out.println(a1.equals(a2)); ///false result
        System.out.println(Arrays.equals(a1, a2)); ///true result
    }

    public void Coll() {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "A", "B", "Car");
        int freq = Collections.frequency(list, "A");
        System.out.println(freq);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        java.util.Comparator<String> comp = new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        list.sort(comp);
        System.out.println(list);
        Collections.reverse(list);
        String min = Collections.min(list);
        String max = Collections.max(list);
        String compare = Collections.max(list, comp);
        Collections.shuffle(list);
        Collections.fill(list, "B");
        System.out.println(list);
    }
}

class Car implements Comparable<Car> {
    public static void main(String[] args) {
        java.util.Comparator<Car> comp = new java.util.Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed.compareTo(o2.speed);
            }
        };
        Set<Car> car1 = new TreeSet<Car>();
        Collections.addAll(car1, new Car("Pride", 20, 200));
        Set<Car> car2 = new TreeSet<Car>();
        Collections.addAll(car2, new Car("pegue", 12, 800));
        for (Car car : car1) {
            System.out.println(car.name);
        }
        for (Car car : car2) {
            System.out.println(car.name);
        }
    }

    String name;
    Integer price, speed;

    public Car(String name, Integer price, Integer speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public int compareTo(Car o) {
        return this.price.compareTo(o.price);
    }
}
