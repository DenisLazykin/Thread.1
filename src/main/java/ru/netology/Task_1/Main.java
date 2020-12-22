package ru.netology.Task_1;

public class Main {

    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("threadGroup");

        final Thread thread1 = new Thread(threadGroup, new MyThread("1"));
        final Thread thread2 = new Thread(threadGroup, new MyThread("2"));
        final Thread thread3 = new Thread(threadGroup, new MyThread("3"));
        final Thread thread4 = new Thread(threadGroup, new MyThread("4"));

        System.out.println("creating threads...");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.printf("I'm - %s, main thread!\n", Thread.currentThread().getName());

        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {
            System.out.printf("While I was waiting, they tried to complete me.");
        }
        System.out.println("\nEnd all threads:");
        threadGroup.interrupt();
    }
}
