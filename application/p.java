package application;

public class p {
    public static void main(String[] args) {

    }
    void f() {
        System.out.println("f");
    }
}
class Child extends p {
    public static void main(String[] args) {
        Child child  = new Child();
    }

    @Override
    void f() {
        super.f();
        System.out.println("child");
    }
}

class Middle extends Child {
    public static void main(String[] args) {
        Middle m = new Middle();
        m.f();
    }

    @Override
    void f() {
        super.f();
        System.out.println("middle");
    }
}
