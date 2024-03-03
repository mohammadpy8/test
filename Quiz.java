import java.util.*;

import static java.lang.Math.*;

public class Quiz {
    public static void main(String[] args) {
        Quiz QQ = new Quiz();
        System.out.println(QQ.number);
        QQ = new Quiz();
        System.out.println(QQ.number);
        QQ = new Quiz();
        System.out.println(QQ.number);
    }

    public int number = f();

    private int f() {
        System.out.println("init");
        return 1;
    }

    public Quiz() {
        System.out.println("no-args");
        number = 3;
    }

    public Quiz(int num) {
        System.out.println("one args");
        number = num;
    }
}

class UsePakages {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

        int[] original = new int[5];
        int[] copy = Arrays.copyOf(original, 10);
        System.out.println(original);
        System.out.println(copy);
    }
}

class Book {
    private String title;
    private int age;
    private int page;

    static int num;

    public static void main(String[] args) {
        Book myBook;
        myBook = new Book();
        myBook.setPage(10);
        myBook.setTitle("names");
        System.out.println(myBook.setPage(10));
        System.out.println("gggggg");
        myBook.num = 10;
        System.out.println(num);
    }

    private void setTitle(String newTitle) {
        title = newTitle;
    }

    static void ss() {
        System.out.println("gggg");
    }

    private int getPage() {
        return page;
    }

    private int setPage(int newPage) {
        page = newPage;
        return page;
    }


    public int setAge(int newAge) {
        if (newAge > 0 && newAge < 150) {
            age = newAge;
        }
        return age;
    }
}

class Pride {
    public static void main(String[] args) {
        Pride.length = 393;
        Pride.designYear = 20;
        Pride.setLength(2000);
        Pride.setWidth(120);
    }

    int color;
    int price;
    private static int designYear;
    private static int length, width;
    double eigth = Math.pow(2, 3);

    public static void setLength(int newLength) {
        length = newLength;
    }

    public static int setWidth(int newWidth) {
        width = newWidth;
        return width;
    }
}

class StaticImport {
    public static void main(String[] args) {
        double r = 2;
        double area = PI * pow(r, 2);
    }
}

class AnotherClass {
    public static void main(String[] args) {
        AnotherClass An = new AnotherClass();
        An.squareRoot(10);
    }

    public static int MAX_AGE = 2;
    private static double PI = 3.14;
    private static String defaultName = theDefaultName("ali");

    private static String theDefaultName(String name) {
        return name;
    }

    double squareRoot(double d) {
        return sqrt(d);
    }

    static {
        MAX_AGE = 150;
        PI = 3.14;
        String s = theDefaultName("alireza");
        if (s != null)
            defaultName = theDefaultName("alir");
    }
}

class Singleton {
    public static void main(String[] args) {

    }

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}

class StaticP {
    public static void main(String[] args) {
        Cars.getLength(20);
        Cars.setLength(20);
        Cars car = new Cars();
        int carPrice = car.getPrice();
        int carLenght = car.getLength(150);
        System.out.println(carPrice);
        System.out.println("-----");
        System.out.println(carLenght);
    }
}
class Cars {
    private static int length;
    private int price;
    static  {
        System.out.println("price");
        length = 450;
    }
    {
        System.out.println("lenght");
        price = 25000;
    }

    public Cars() {
        this.price = 1200000;
    }

    public static int getLength(int newLength) {
        return newLength;
    }

    public static void setLength(int length) {
        Cars.length = length;
    }

    public int getPrice() {
        length = 540;
        return price;
    }
}