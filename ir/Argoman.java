package ir;

import java.lang.*;

public class Argoman {
    public static void main(String[] args) {
        print();
        print("ali", "m");
        print("aa", "aaa", "aaa");
        Double doubl = Double.valueOf(10);
        double d = doubl.doubleValue();
        int i = doubl.intValue();
        double max = Double.MAX_VALUE;
        Integer integer = Integer.valueOf(12);
        int maxint = Integer.MIN_VALUE;
        String s = new String("m");
    }

    static void print(String... params) {
        String[] array = params;
        System.out.println(array.length);
        for (String p : params) {
            System.out.println(p);
        }
    }
}

class CircleMain {
    public static void main(String[] args) {
        CircleMain c = new CircleMain(2.0);
        System.out.println(c.ToString());
    }

    private double raduis;

    public CircleMain(double newRadius) {
        this.raduis = newRadius;
    }

    public String ToString() {
        return "CircleMain [radius=" + raduis + "]";
    }
}

class Person {
    private String nationalCode;
    private String name;
    private String email;
    private int age;
    private final int maxAge = 12;

    public Person(String newNatioalCode, String newName) {
        this.nationalCode = newNatioalCode;
        this.age = 150;
        this.email = "12345";
        this.name = newName;
    }

    public static void main(String[] args) {
        Person newPerson = new Person("12346", "mohammad");
        System.out.println(1 == 1);
        String answer = newPerson.equals(newPerson, "12346");
        System.out.println(answer);
    }

    public String equals(Person other, String nationalCodeV) {
        if (nationalCodeV == other.nationalCode)
            if (nationalCode.equals(other.nationalCode))
                return "TRUE";
            else
                return "FALSE";
        else
            return "NAME";
    }

    private int maxAges() {
        return maxAge;
    }
}

class SomeClass {
    public static void main(String[] args) {
    }

    private final String name;
    public final int val = 12;

    void f(final int a) {
        final int b = a + 1;
    }

    static void g() {
        final String s = "123";
    }

    public SomeClass(String name) {
        this.name = name;
    }
}

class Color {
    public static final Color BLACK = new Color();
    public static final Color BLUE = new Color();
    public static final Color GREEN = new Color();
    public static final Color RED = new Color();
    Color black = Color.BLACK;
    Color blue = Color.BLUE;
    Color red = Color.RED;
    Color green = Color.GREEN;

    private Color() {

    }
}

class EnumModel {
    enum Model {
        BLACK, BLUE, GREEN, RED
    }

    Model black = Model.BLACK;
    Model red = Model.RED;
    Model green = Model.GREEN;
    Model blue = Model.BLUE;
}
