/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;

/**
 * Created by rodney on 18/02/2017.
 */
public class DefaultValue{
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    void print(){
        System.out.println("boolean  "+t);
        System.out.println("char  "+c);
        System.out.println("byte  "+b);
        System.out.println("short  "+s);
        System.out.println("int  "+i);
        System.out.println("long  "+l);
        System.out.println("float  "+f);
        System.out.println("double  "+d);
    }
    public static void main(String args[]){
        DefaultValue dv=new DefaultValue();
        dv.print();
    }

}