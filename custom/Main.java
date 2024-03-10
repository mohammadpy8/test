package custom;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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

interface Comparator<T extends Number> {
    int compare(T o1, T o2);

    public static void main(String[] args) {
        java.util.Comparator<Person> comp = (a, b) -> a.age().compareTo(b.age());
        System.out.println(comp);
        List<Person> poeple = Arrays.asList(
                new Student(),
                new Student()
        );
        Collections.sort(poeple, new java.util.Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age().compareTo(o2.age());
            }
        });
        Collections.sort(poeple, (a, b) -> a.age().compareTo(b.age()));
    }
}


