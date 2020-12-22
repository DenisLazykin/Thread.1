package ru.netology.Task_1;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Hello all!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s end\n", getName());
        }
    }
}
