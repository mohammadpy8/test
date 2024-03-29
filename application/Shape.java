package application;

import java.util.Date;

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

abstract class R1 implements Shape {
}

abstract class R2 implements Shape {
}

abstract class R3 extends PaintObject implements Shape {
}

abstract class R4 extends PaintObject implements Shape, CanFight {
}

interface Person {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public Date getBirthday() {
                return new Date();
            }
        };
        Integer ageOfPerson = person.age();
        System.out.println(ageOfPerson);
    }

    Date getBirthday();

    default Integer age() {
        long diff = new Date().getTime() - getBirthday().getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }
}

class OuterClass {
    public static void main(String[] args) {

    }

    private int value = 2;

    public void f() {
    }

    public class Inner {
        public static void main(String[] args) {

        }

        public void innerMethod() {
//            value = 5; or --> OuterClass.this.value=5
            OuterClass.this.value = 5;
        }
    }

    interface X {
        void g();
    }

    enum Y {A, B}
}

class OutClass {
    public static void main(String[] args) {
        OutClass outer = new OutClass();
        System.out.println(outer.values);
        outer.outerMethod();
        System.out.println(outer.values);
    }

    private int values;

    public class InnerClass {
        public static void main(String[] args) {

        }

        public void changeMethod() {
            OutClass.this.values = 10;
        }
    }

    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.changeMethod();
    }
}

class NewOutClass {
    public static void main(String[] args) {
        NewOutClass newClass = new NewOutClass();
        NewOutClass.Inner inner = newClass.new Inner();
        System.out.println(newClass.numbers);
        System.out.println("----------");
        inner.f();
        System.out.println(newClass.numbers);
    }

    private int numbers = 2;

    class Inner {
        public void f() {
            NewOutClass.this.numbers = 10;
        }
    }
}

abstract class Protocol {
    public abstract void func();
}

class NewOuterClass {
    public static void main(String[] args) {
        NewOuterClass newOut = new NewOuterClass();
        System.out.println(newOut.value);
        newOut.outerMethod();
        System.out.println(newOut.value);
    }

    private int value;

    public void outerMethod() {
        Protocol pro = new Protocol() {
            @Override
            public void func() {
                NewOuterClass.this.value = 10;
            }
        };
        pro.func();
    }
}

class Animals {
    public static void main(String[] args) {

    }
}

interface CanMove {
    void move();
}

interface CanRunner extends CanMove {
    @Override
    void move();

    void Runner();
}

interface CanFlying extends CanMove, CanRunner {
    @Override
    void move();

    @Override
    void Runner();
}

class AirPlane implements CanFlying {
    public static void main(String[] args) {
        AirPlane air = new AirPlane();
        air.move();
        air.Runner();
    }

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void Runner() {
        System.out.println("Runner");
    }
}