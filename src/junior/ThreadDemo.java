/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class ThreadDemo extends Thread {
    private Thread t;
    public String threadname;

    ThreadDemo(String name){
        threadname = name;
        System.out.println("Creating " + threadname);
    }
    public void run(){
        System.out.println("Running "+ threadname);
        try {

            for (int i = 0; i < 4; i++) {
                System.out.println("Thread  "+ threadname + i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            System.out.println(("Thread " + threadname + " interrupted."));
        }

        System.out.println("Thread " + threadname + " exiting.");
    }

    public void start(){
        if(t ==null){
            t= new Thread(this,threadname);
            t.start();
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo("线程1 ");
//        threadDemo.setPriority(10);
        threadDemo.start();
        ThreadDemo threadDemo1 = new ThreadDemo("线程2 ");
//        threadDemo1.setPriority(1);
        threadDemo1.start();
    }
}
