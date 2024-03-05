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

abstract class Animals {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void talk();

    public static void main(String[] args) {

    }
}

class Animalss extends Animals {
    public static void main(String[] args) {

    }

    @Override
    public void talk() {
        System.out.println("talk is method abstract");
    }
}
abstract class Shap{
    public static void main(String[] args) {

    }
    public abstract double getArea();
    public abstract double getPremeter();
}
class Rectangle extends Shap{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec.getArea());
        System.out.println(rec.getPremeter());
    }

    @Override
    public double getPremeter() {
        return 150;
    }

    @Override
    public double getArea() {
        return 120;
    }
}