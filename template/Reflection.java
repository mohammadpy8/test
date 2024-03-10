package template;

public class Reflection {
    static int s1 = f();

    static {
        System.err.println("static block");
        s1 *= 2;
    }

    public static void g() {
    }

    private static int f() {
        System.err.println("inline static init");
        return 5;
    }
}
class Statics {
    public static void main(String[] args) throws ClassNotFoundException {
        Reflection e;
        System.err.println("After Decelaration");
        Reflection.g();
        e = new Reflection();
        e = new Reflection();
        Reflection ref = new Reflection();
        System.out.println("--------");
        String ff = ref.getClass().getSimpleName();
        System.out.println(ff);
        Class.forName("a");
    }
}
