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

class CriticalSection {
    private float balance;

    public synchronized void deposit(float amount) {
        balance += amount;
    }

    public synchronized void withdraw(float amount) {
        balance -= amount;
    }

    public static void main(String[] args) {

    }
}

class Interrupting extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Interrupting t = new Interrupting();
        t.start();
        try {
            Thread.sleep(1000);
            t.interrupt();
        } catch (InterruptedException e1) {
            System.out.println(e1.getMessage());
        }
    }

    @Override
    public synchronized void run() {
        try {
            wait(100);
            System.out.println("After wait");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            throw new RuntimeException(e);
        }
        System.out.println("Resume");
    }
}

class Scan extends Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        Scan scan = new Scan();
        Object obj = scan.obj = new Object();
        scan.start();
        synchronized (obj) {
            obj.wait();
            System.out.println("Main other jobs");
        }
    }

    public Object obj;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("scan");
        synchronized (obj) {
            obj.notify();
        }
        System.out.println("Scan other jobs");
    }
}