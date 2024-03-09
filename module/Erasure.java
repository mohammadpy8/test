package module;

import java.util.ArrayList;
import java.util.List;

public class Erasure<T> {
    public static void main(String[] args) {

    }

    void f() {
        Erasure<String> g1;
        g1 = new Erasure<String>();
        Erasure<Integer> g2;
        g2 = new Erasure<Integer>();
    }
}

class Generic<K> {
    public static void main(String[] args) {
        Generic<String> g = new Generic<>();
        List<String> list = new ArrayList<>();
        list.add("a");
        g.add(list, new Object());
        g.add(list,1);
        for(String s : list) {
            System.out.println(s);
        }
    }

    void add(List<K> l, Object o) {
        l.add((K) o);
    }
}
