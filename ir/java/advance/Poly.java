package ir.java.advance;

public class Poly {
    public static void main(String[] args) {
        System.out.println("main run projects");
    }

    public void f() {
        System.out.println("f a function");
    }
}

class Children extends Poly {
    public static void main(String[] args) {
        Poly p = new Poly();
        p.f();
        Children child = new Children();
        child.f();
        p = child;
        p.f();
    }

    @Override
    public void f() {
        super.f();
    }
}
abstract class Animals{
    public abstract void talk();
    public static void main(String[] args) {

    }
}