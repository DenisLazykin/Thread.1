package ru.netology.Task_2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object call() throws Exception {
        int i = 0;
        long t = System.currentTimeMillis();
        long end = t + 20000;
        try {
            while (System.currentTimeMillis() < end){
                System.out.printf("I'm thread %s. Hello all!\n", getName());
                i++;
                Thread.sleep(3000);
            }
        } catch (InterruptedException err) {
    } finally {
            System.out.printf("Thread %s completed, number of executions - %d.\n", getName(), i);
        }
        return i;
        }
}
