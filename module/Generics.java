package module;

import java.util.*;

public class Generics<E> {
    public static void main(String[] args) throws Exception {
        Generics<String> st1 = new Generics<String>(10);
        st1.push("A");
        Generics<Integer> st2 = new Generics<Integer>(20);
        st2.push(10);
    }

    private E[] elements;
    private int top;

    public void push(E pushValue) throws Exception {
        if (top == elements.length - 1) throw new Exception();
        elements[++top] = pushValue;
    }

    public E pop() {
        if (top == -1) throw new EmptyStackException();
        return elements[--top];
    }

    public Generics(int maxsize) {
        top = -1;
        elements = (E[]) new Object[maxsize];
    }
}

class Pair<T1, T2> {
    public static void main(String[] args) {
        Pair<String, Double> p1;
        p1 = new Pair<String, Double>("alireza", 19.0);
        String name = p1.getFirst();
        System.out.println(name);
        Double avg = p1.getSecond();
        System.out.println(avg);
    }

    private T1 first;
    private T2 second;

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void PairTest() {
        Pair<String, String> p2;
        p2 = new Pair<String, String>("ali", "mohammad");
        String fistName = p2.getFirst();
        System.out.println(fistName);
        String lastName = p2.getSecond();
        System.out.println(lastName);
    }
}

class Node<E> {
    public static void main(String[] args) {
        Node<String> last = new Node<String>("Ali", null);
        Node<String> first = new Node<String>("Mohammad", last);
        System.out.println(first.item);
        System.out.println(last.next);
    }

    E item;
    Node<E> next;

    Node(E element, Node<E> next) {
        this.item = element;
        this.next = next;
    }
}

class NumbersQueue<T extends Number> {
    public static void main(String[] args) {
        NumbersQueue<Integer> n;
        NumbersQueue<Double> d;
        NumbersQueue<Long> l;
        NumbersQueue<Byte> b;
        NumbersQueue<Integer> numbers = new NumbersQueue<Integer>(); /////version old
        NumbersQueue<Float> f = new NumbersQueue<>(); //// new version
        numbers.enqueue(12);
        Map<String, List<Number>> map = new HashMap<>();
    }

    public void enqueue(T o) {
        System.out.println(o);
    }

    public T dequeue() {
        System.out.println("T generics");
        return null;
    }
}

class GenericsClass<T> {
    public static void main(String[] args) {
        GenericsClass gn = new GenericsClass();
        gn.f(10, 20);
    }

    public <E extends T> void f(E p1, E p2) {
        System.out.println(p1);
        System.out.println(p2);
    }
}

class NotGenerics {
    public static void main(String[] args) {
        String s = new NotGenerics().chooseRandom("A", "B");
        Integer num = new NotGenerics().chooseRandom(10, 300);
        num = NotGenerics.max(10, 22);
        s = NotGenerics.max("A", "B");
    }
    public <T> T chooseRandom(T p1, T p2) {
        if (new Random().nextFloat() > 0.5)
            return p1;
        return p2;
    }

    public static <E extends Comparable> E max(E p1, E p2) {
        return p1.compareTo(p2) > 0 ? p1 : p2;
    }
}
class Box<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public Box (T value){
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);
    }
}

