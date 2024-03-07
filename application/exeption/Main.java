package application.exeption;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int years = main.getYear("2010/11/29");
        System.out.println(years);
    }

    public int getYear(String day) {
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
