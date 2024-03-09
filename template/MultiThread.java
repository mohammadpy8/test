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
