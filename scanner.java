import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLenght = scanner.nextInt();
        String[] names = new String[arrayLenght];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }
        System.out.println(names[names.length - 1]);
        String[] array;
        array = new String[10];
        for (int j = 0; j < array.length; j++) {
            array[j] = scanner.next();
        }
        String input = "nader and naser";
        char ch = input.charAt(1);
        System.out.println(ch);
        int j = input.indexOf("naser");
        System.out.println(j);
        int i = input.lastIndexOf("er");
        String newS = input.replace("nader", "mohamad");
        String sth = newS + i;
        System.out.println(sth);
    }
}

class Student {
    public static void main(String[] args) {
        Student[] s = new Student[10];
        for (int i = 0; i < 10; i++) {
            s[i].setID(i + 10000);
        }
        System.out.println(s[5].getID());
        String names = "ali";
        String reverse = new StringBuilder(names).reverse().toString();
        System.out.println(reverse);
        int a = 5;
        int b = 4;
        badSwap(a, b);
    }

    private String name;
    private long ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long newID) {
        ID = newID;
    }

    public int getID(int newsID) {
        if (newsID > 5)
            return newsID++;
        else
            return newsID--;
    }

    public static void badSwap(int var1, int var2) {
        int temp = var1;
        var2 = temp;
        System.out.println(temp);
        System.out.println(var2);
    }

}

class Students {
    public static void main(String[] args) {
        Students st = new Students();
        st.init("mohamad", 150);
    }

    private String name;
    private long id;
    private String homePage;

    public void setName(String S) {
        name = S;
    }

    public void setId(long idValue) {
        id = idValue;
    }

    public void setHomePage(String addr) {
        homePage = addr;
    }

    public void init(String name, long id) {
        setHomePage(name);
        setId(id);
    }

}

class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println(c.getArea());
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

class Constructors {
    private int number;
    private double real;
    private boolean coditions;
    private String name;
    private Circle circle;

    public Constructors(int num, String title) {
        number = num;
        name = title;
    }

    public static void main(String[] args) {
        Constructors Q = new Constructors(10, "lable");
        System.out.println(Q.circle);
        System.out.println(Q.coditions);
        System.out.println(Q.real);
        System.out.println(Q.number);
        System.out.println(Q.name);
    }
}