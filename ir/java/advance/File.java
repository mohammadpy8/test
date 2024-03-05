package ir.java.advance;

public class File {
    public static void main(String[] args) {

    }

    public void Talk() {
    }
}

class NewFile extends File {
    public static void main(String[] args) {

    }

    private String name;

    public String toString() {
        return name;
    }

    @Override
    public void Talk() {
        super.Talk();
        System.out.println("override");
    }
}

class SuperClass {
    public static void main(String[] args) {
        SuperClass t = new SuperClass();
        t.f();
        t.f(10);
        t.f("10");
        t.f(10, 20);
    }

    private void f() {
        System.out.println("1");
    }

    void f(int a) {
        System.out.println("2");
    }

    protected void f(String a) {
        System.out.println("3");
    }

    public void f(int a, int b) {
        System.out.println("4");
    }
}

class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.f();
        s.f(1);
        s.f("1");
        s.f(1, 25);
    }

    public void f() {
        System.out.println("5");
    }

    protected void f(String a) {
        System.out.println("6");
    }

    public void f(int a, int b) {
        System.out.println("7");
    }

    @Override
    void f(int a) {
        super.f(a);
        System.out.println("8");
    }
}

class Parent {
    public static void main(String[] args) {

    }

    public int a;

    public Parent(int a) {
        this.a = a;
    }

    void f() {
        System.out.println("f function");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child(10);
        child.f();
        child.g();
    }

    public Child(int a) {
        super(a);
    }

    public void g() {
        f();
    }

    @Override
    void f() {
        super.f();
        System.out.println("f a override function");
    }
}
