package template;

import java.lang.*;

public class MultiThread extends Thread {
    public static void main(String[] args) {

    }

    @Override
    public void run() {
        System.out.println("h");
        System.out.println("b");
    }
}

class ThreadExample {
    public static void main(String[] args) {
        System.out.println("h");
        MultiThread t = new MultiThread();
        t.start();
        System.out.println("b");
    }
}

class MyRunnable implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable());
        t.start();
        Thread tt = Thread.currentThread(); ///static method
    }

    @Override
    public void run() {
        System.out.println("h");
        System.out.println("b");
    }
}

class PrintThread implements Runnable {
    public static void main(String[] args) {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getName());
    }
}

class ThreadP {
    public static void main(String[] args) {
        new Thread(new PrintThread()).start();
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
        Thread currentThread = Thread.currentThread();
        System.out.println("main" + currentThread.getId());
        System.out.println("main" + currentThread.getName());
    }
}
