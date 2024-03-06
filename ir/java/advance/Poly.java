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

abstract class Shap {
    public static void main(String[] args) {
        Shap shap = new Shap() {
            @Override
            public double getArea() {
                return 150;
            }

            @Override
            public double getPremeter() {
                return 150;
            }
        };
        shap.getArea();
        shap.getPremeter();
    }


    public abstract double getArea();

    public abstract double getPremeter();
}

class Rectangle extends Shap {
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

class Triggle extends Shap {
    public static void main(String[] args) {
        Triggle tr = new Triggle();
        tr.setLength(25);
        tr.setWidth(80);
        System.out.println(tr.getArea());
        System.out.println(tr.getPremeter());
    }

    private double width, length;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPremeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

abstract class Now {
    public static void main(String[] args) {

    }

    public abstract int getName();
}

class NetNew extends Now {
    private int[] numbers;

    public static void main(String[] args) {
        NetNew net = new NetNew();
        System.out.println(net.setNumbers(new int[]{10, 20}));
        System.out.println(net.getName());
    }

    public int setNumbers(int[] numbers) {
        this.numbers = numbers;
        return 0;
    }

    private int def;

    @Override
    public int getName() {
        for (int i = 0; i < numbers.length; i++) {
            def += numbers[i];
        }
        System.out.println(def);
        if (def > 20) {
            return 10;
        } else {
            return 20;
        }
    }
}