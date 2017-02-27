/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;/**
 * Created by rodney on 19/02/2017.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        Thread t1 = new Thread(){
            public void run(){
                ping();
            }
        };
            t.start();
            t1.start();
    }

    static void pong() {
        System.out.print("pong");
    }
    static void ping() {
        System.out.print("ping");
    }
}
