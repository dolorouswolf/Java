/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class ThreadClassDemo {
    public static void main(String[] args) {
//        Runnable r1 = new DisplayMessage("hello");
//        Thread t1 = new Thread(r1, "线程1");
//        t1.start();
//
//        Runnable r2 = new DisplayMessage("bye");
//        Thread t2 = new Thread(r2, "线程2");
//        t2.start();

//        System.out.println("Starting thread3...");
//        Thread thread3 = new GuessNumber(27);
//        thread3.start();
//        try {
//
//            thread3.join();
//        } catch (InterruptedException e) {
//
//            System.out.println("Thread interrupted.");
//        }
//        System.out.println("Starting thread4...");
//        Thread thread4 = new GuessNumber(75);
//
//        thread4.start();
//        System.out.println("main() is ending...");

        Runnable synchronizedemo = new SynchronizeDemo("Thread-1 ");
        Runnable synchronizedemo1 = new SynchronizeDemo("Thread-2 ");
        Thread t1 = new Thread(synchronizedemo);
        Thread t2 = new Thread(synchronizedemo);
        t1.start();
        t2.start();

    }
}

class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String m) {
        this.message = m;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}


class GuessNumber extends Thread {
    private int number;

    public GuessNumber(int n) {
        this.number = n;

    }

    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName()

                    + " guesses " + guess);
            counter++;
        } while (guess != number);
        System.out.println("** Correct! " + this.getName() + " in " + counter + " guesses.**");
    }
}


class SynchronizeDemo implements Runnable{
    private   String name ;
    public  SynchronizeDemo(String threadname ){
        name= threadname;
        System.out.println(name+"线程开始");
    }

    public  volatile  int i = 0;

    public       void add(String threadname){
            i++;

            System.out.println(threadname + i);
    }


    public void run(){
        System.out.println(name+"线程运行中");
        try {
            for (int j = 0; j < 10; j++) {
                this.add(name);
                Thread.sleep(50);
            }
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

