package ir.java;

public class Animals {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.setAge(10);
        animals.setName("wolf");
        Dog dog = new Dog();
        dog.setName("dog");
        dog.setAge(120);
        dog.setSpeed(152.12);
    }

    public int age;
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("student" + name);
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(12);
        dog.setSpeed(500);
    }

    private double speed;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("stue" + speed);
    }

    public double getSpeed() {
        return speed;
    }
}

class Country {
    public static void main(String[] args) {

    }

    private String name;
    private String city;

    public Country(String city, String name) {
        this.name = name;
        this.city = city;
    }
}

class City extends Country {
    public static void main(String[] args) {

    }

    private long Id;

    public City(String name, long id, String city) {
        super(city, name);
        this.Id = id;
    }
}
class Parent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Children children = new Children();
        parent.f();
        children.f();
    }
    protected void f(){
        System.out.println("f is a function");
    }
}
class Children extends Parent{
    public static void main(String[] args) {
        Parent parent = new Parent();
        Children children = new Children();
        parent.f();
        children.f();
        children.a();
        children.b();
        children.c();
    }
    public void f() {
        System.out.println("f is a child function");
    }
    public void a(){f();}
    public void b(){this.f();}
    public void c(){super.f();}
}
class A {
    public int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
class B extends A {

    public static void main(String[] args) {
        new B ().f();
    }
    private int a;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getA() {
        return a;
    }

    public void f() {
        int a;
        this.a = 5;
        super.a = 6;
        a = 4;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
