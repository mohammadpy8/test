package application.exeption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        int years = main.getYear("2010/11/29");
        System.out.println(years);
        System.out.println("-----");
        int year = main.Years("2000/12/12 ");
        System.out.println(year);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a date:");
        String date = scanner.next();
        try {
            Integer yearss = main.Years(date);
            System.out.println(yearss);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getYear(String day) {
        String yearString = day.substring(0, 4);
        int year = Integer.parseInt(yearString);
        return year;
    }

    public int Years(String day) throws Exception {
        if (day == null || day.isEmpty()) {
            throw new Exception("baddddd!!");
        }
        String yearString = day.substring(0, 4);
        int year = Integer.parseInt(yearString);
        return year;
    }
}

class ExceptionHanding {
    public static void main(String[] args) {
        try {
            f();
            g();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Error("error");
        }
        m();
    }

    private static void f() {
        System.out.println("f");
    }

    private static void g() {
        h();
        System.out.println("g");
    }

    private static void h() {
        System.out.println("h");
    }

    private static void m() {
        System.out.println("m");
    }
}

class Test {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        try {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int div = test.division(first, second);
            System.out.println(div);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int division(int first, int second) throws Exception {
        if (second == 0) {
            throw new Exception("oops");
        }
        return first / second;
    }
}

class StackTrace {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void f() {
        g();
    }

    private static void g() {
        throw new NullPointerException();
    }
}

class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            try {
                String str = scanner.next();
                age = Integer.parseInt(str);
                validAge = true;
            } catch (Exception e) {
                System.out.println("Enter a valid number:");
            }
        }
        System.out.println("You are " + age + "years old");
    }
}

class Text {
    public static void main(String[] args) throws Exception {
        f();
        int gg = g(new int[]{10, 50, -90, -85}, new int[]{25, 80, -14});
        int ggg = g(new int[]{4, 8, 90, 150, -60}, new int[]{25, 80, 15});
        System.out.println(gg);
        System.out.println(ggg);
    }

    private static void f() {
        System.out.println("f");
    }

    private static int g(int[] x, int[] y) throws Exception {
        int sum = 0;
        for (int numberX : x) {
            sum += numberX;
        }
        if (sum >= 60) {
            for (int numberY : y) {
                sum = +numberY;
            }
            return sum;
        } else if (sum <= 60) {
            for(int number : x) {
                for(int numbers: y){
                    sum = numbers + number;
                }
            }
            return sum;
        } else {
            throw new Exception("nnn");
        }
    }
}
