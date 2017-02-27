/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

import java.io.Closeable;
import java.io.Serializable;
import java.util.*;

/**
 * Created by rodney on 20/02/2017.
 */
public class MyInterface {
    public static void main(String[] args) {
        HashMap  m;
        Hashtable t;
        AbstractMap am;
        Stack s;
        Properties p;
        SortedSet ss;
    }
}

interface Animals extends Serializable , Cloneable{
    public void eat();
    public void move();
}

class Dog1 implements Animals{
    @Override
    public void eat() {
        System.out.println("eat bone");
    }

    @Override
    public void move() {
        System.out.println( "jump to desktop");
    }
}

class Cat1 implements Animals{
    @Override
    public void eat() {
        System.out.println("ate mice");
    }

    @Override
    public void move() {
        System.out.println("no ! sleeping");
    }
}