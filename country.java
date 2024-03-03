public class country {
    public static void main(String[] args) {
        System.out.println();
    }
    private String name;
    private int poplulation;
    public country() {
        name = "iran";
    }
    public country(int number) {
        this();
        poplulation = number;
    }
    public country(String n, int number) {
        this(number);
        name = n;
    }
}
