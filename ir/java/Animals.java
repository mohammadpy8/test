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

    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
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

    public double getSpeed() {
        return speed;
    }
}
