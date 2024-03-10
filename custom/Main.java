package custom;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface Person<E extends Number> {
    Date getBirthday();

    default Integer age() {
        long diff = new Date().getTime() - getBirthday().getTime();
        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }
}

class Student implements Person {
    private Date birthDate;

    @Override
    public Date getBirthday() {
        return birthDate;
    }

    @Override
    public Integer age() {
        long yearMilieSeconds = 100L * 60 * 60 * 24 * 360;
        long currentYear = new Date().getTime() / yearMilieSeconds;
        long birthYear = getBirthday().getTime() / yearMilieSeconds;
        return (int) (currentYear - birthYear);
    }
}
