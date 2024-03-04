import java.lang.*;

public class enumComplex {
    public static void main(String[] args) {
        Shap sh = Shap.CIRCLE;
        System.out.println(sh.getNumber());
        sh = Shap.valueOf("CIRCLE");
        System.out.println(sh.getNumber());
        Shap[] array = Shap.values();
        for (Shap s : array) {
            System.out.println(s.name());
        }
    }

    enum Shap {
        RECTANGLE(1),
        CIRCLE(2),
        SQUARE(3);
        private int number;

        Shap(int i) {
            number = i;
        }

        public int getNumber() {
            return number;
        }
    }
}

class Question {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 2));
        Integer integer = Integer.valueOf(3);
        System.out.println(sum(1, 2, integer));
        System.out.println(sum("1", "2"));
        System.out.println(sum("one", "two"));
    }

    static int sum(Integer... number) {
        int s = 0;
        for (Integer i : number) {
            s += i;
        }
        return s;
    }

    static int sum(String s1, String s2) {
        Integer[] value = {Integer.valueOf(s1), Integer.valueOf(s2)};
        return sum(value);
    }
}

enum Status {SENT, DELIVERED, PENDING}

class SMS {
    public static void main(String[] args) {
        SMS sms = new SMS("hi", "12", "13");
        sms.setStatus(Status.DELIVERED);
        System.out.println(sms);
    }

    private Status status;
    private final String msg;
    private final String from, to;

    public SMS(String msg, String from, String to) {
        this.to = to;
        this.from = from;
        this.msg = msg;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toStirng() {
        return String.format("%s=>%s:%s(%s)", from, to, msg, status);
    }
}

class Person {
    public static void main(String[] args) {
        Person person = new Person("a");
        System.out.println(person.toString());
    }

    private final String name;
    private Integer age = null;
    private Double length = null;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public String toString() {
        return name + "(" + age + ")";
    }

}
