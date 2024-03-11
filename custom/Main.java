package custom;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.*;
import java.util.stream.Stream;

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
//        Supplier<Person<Integer>> personSupplier = Person::new;
//        personSupplier.get();
        Consumer<Person<Integer>> greeter = (p) -> System.out.println(p.getBirthday().getTime());
        greeter.accept(new Person<Integer>() {
            @Override
            public Date getBirthday() {
                return null;
            }
        });
    }
}

class ConsumerFunc {
    public static void main(String[] args) {
        Map<Integer, String> map = null;
        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Key:" + key + "Value:" + value);
        map.forEach(biConsumer);
        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" + (num1 + num2);
        System.out.println(biFunction.apply(10, 50));
    }
}

class Exercise {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(1),
                new Apple(2),
                new Apple(2),
                new Apple(4),
                new Apple(5)
        );
        List<Apple> filtered = filter(apples, (a) -> a.size > 2);

        Collections.sort(apples, new java.util.Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.size - o2.size;
            }
        });
        apples.sort((a1, a2) -> a1.size - a2.size); //// best way for sort
    }

    static List<Apple> filter(List<Apple> list, Predicate<Apple> condition) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : list) {
            if (condition.test(apple))
                result.add(apple);
        }
        return result;
    }
}

@FunctionalInterface
interface MyIn {
    void f();

    default int g() {
        return 10;
    }
}

class MyClass implements MyIn {
    @Override
    public void f() {
        System.out.println("f ----> function");
    }

    @Override
    public int g() {
        return 20;
    }
}

class Apple {
    int size;

    public Apple(int size) {
        this.size = size;
    }
}

class Car {
    public String name;
    public int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        List<Car> list = Arrays.asList(
                new Car("p", 100),
                new Car("n", 120)
        );
        Stream<Car> newList = list.stream().filter((car) -> "p".equals(car.name)).sorted((a, b) -> a.price - b.price).limit(1);
        System.out.println(newList);

    }
}

class OptionalClasses {
    public static Optional<String> opt = Optional.of("salam!");
    boolean b = opt.isPresent();
    String s = opt.get();
    String t = opt.orElse("bye!");

    public static void main(String[] args) {
        opt.ifPresent((s) -> System.out.println(s.charAt(2)));
    }
}

class Cars {
    int price;
    String color;

    public Cars(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car[color=" + color + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        List<Cars> list = Arrays.asList(
                new Cars("b", 100),
                new Cars("c", 200),
                new Cars("a", 300),
                new Cars("s", 400),
                new Cars("d", 500)
        );
        list.stream().forEach(System.out::println);
        list.stream().forEach((car) -> System.out.println(car.color));
    }
}





