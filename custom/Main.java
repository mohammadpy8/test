package custom;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

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

class Str {
    Character startWith(String s) {
        return s.charAt(0);
    }
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);

    public static void main(String[] args) {
        Str str = new Str();
        Converter<String, Character> conv = str::startWith; //// method reference
        Character converted = conv.convert("Java");
        Converter<String, Integer> converter = Integer::valueOf;
    }
}

class Pre {
    public static String st = "ok";
    public static boolean b;

    public static void main(String[] args) {
        Predicate<String> notEmpty = (x) -> !x.isEmpty();
        b = notEmpty.test(st);
        b = notEmpty.negate().test(st);
        Predicate<String> notNull = Objects::nonNull;
        b = notNull.and(notEmpty).test(st);
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(isNotEmpty.test(st));
    }
}
class FunctionEx {
    private static Function<String, String> backToString;

    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");
    }
}


