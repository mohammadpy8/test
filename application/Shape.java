package application;

public interface Shape {
    public static void main(String[] args) {

    }

    public double getArea();

    public double getPerimeter();
}

interface CanRun {
    public static void main(String[] args) {

    }

    void Run();
}

interface CanThink {
    public static void main(String[] args) {

    }

    void think();
}

interface CanTalk extends CanThink {
    void talk();
}

interface Human extends CanRun, CanTalk {
    @Override
    void think();
}

class Rectangle implements Shape {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        int sum = rec.Max(0, new int[]{10, 30, 50, 60});
        System.out.println(sum);
    }

    public int Max(int m, int[] n) {
        for (int j : n) {
            m += j;
            System.out.println(m);
            System.out.println(j);
        }
        return m;
    }

    @Override
    public double getArea() {
        return 120;
    }

    @Override
    public double getPerimeter() {
        return 150;
    }
}

class Trigger implements Shape {
    public static void main(String[] args) {

    }

    private double width, length;
    private int color;

    public Trigger(double width, double length, int color) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return width * length;
    }

    @Override
    public double getArea() {
        return 2 * (width + length);
    }
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    private String name;

    public String getName() {
        return name;
    }
}

class Hero extends ActionCharacter implements CanFly, CanFight, CanSwim {
    public static void main(String[] args) {
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void fight() {
        System.out.println("fight");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

abstract class PaintObject {
    public static void main(String[] args) {

    }

    public abstract int draw();

    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

abstract class R1 implements Shape {}
abstract class R2 implements Shape {}
abstract class R3 extends PaintObject implements Shape{}
abstract class R4 extends PaintObject implements Shape,CanFight{}
