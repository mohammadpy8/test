package custom;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

    }
}

interface Person {
    Date getBirthday();
    default Integer age() {
        long diff = new Date().getTime() - getBirthday().getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }
}
