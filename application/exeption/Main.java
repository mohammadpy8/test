package application.exeption;

import java.io.IOException;
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
            for (int number : x) {
                for (int numbers : y) {
                    sum = numbers + number;
                }
            }
            return sum;
        } else {
            throw new Exception("nnn");
        }
    }
}

class Program {
    public static void main(String[] args) throws Exception {
        Program program = new Program();
        try {
            int first = program.readInt();
            int second = program.readInt();
            int div = program.division(first, second);
            System.out.println(div);
        } catch (IOException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private int readInt() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.matches("[\\d]+")) {
            return Integer.parseInt(str);
        }
        throw new IOException("bad input");
    }

    private int division(int first, int second) throws ArithmeticException {
        if (second == 0) {
            throw new ArithmeticException("OOPS");
        }
        return 2 * (first / second);
    }
}

class MultipleCatch {
    public static void main(String[] args) throws Exception {
        try {
            int den = Integer.parseInt(args[0]);
            System.out.println(3 / den);
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
            System.out.println("Divisor is zero");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.getMessage());
            System.out.println("Missing arguments");
        }
        System.out.println("After exception");
    }
}

class BadIranianNationalID extends Exception {
    public static void main(String[] args) throws Exception {
        String input = "123456789";
        try {
            throw new BadIranianNationalID();
        } catch (BadIranianNationalID e) {
            System.out.println("Bad ID");
        }
    }

    static void Method(int n) throws Exception {
        try {
            switch (n) {
                case 1:
                    System.out.println("1st case");
                    return;
                case 3:
                    System.out.println("3st case");
                    throw new RuntimeException("3!");
                case 4:
                    System.out.println("4st case");
                    throw new Exception("4!");
                case 2:
                    System.out.println("2nd case");
            }
        } catch (RuntimeException e) {
            System.out.println("Runtime Error");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try-block entered");
        }
    }
}

