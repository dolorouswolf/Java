/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package DesignModel;

/**
 * Created by rodney on 20/02/2017.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {};

    public static Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton m =Singleton.getInstance();
        Singleton my = Singleton.getInstance();
        Singleton my1 = Singleton.getInstance();
        System.out.println(my.equals(my1));
    }
}
