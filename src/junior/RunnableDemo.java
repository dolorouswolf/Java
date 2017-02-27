/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class RunnableDemo implements  Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating " +  threadName);
    }

    public void run(){
        System.out.println("Running " +threadName);
        try {
            for (int i = 0; i <4; i++) {
                System.out.println("Thread:" + threadName + ","+ i );
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread" + threadName +  "interrupted.");
        }

        System.out.println("Thread "+ threadName+ " exiting");
    }

    public void start(){
        System.out.println("Starting " +  threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo("F");
        runnableDemo.start();

        RunnableDemo runnableDemo1 = new RunnableDemo("E");
        runnableDemo1.start();
    }
}
