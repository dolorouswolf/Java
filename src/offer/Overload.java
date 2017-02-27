/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;/**
 * Created by rodney on 18/02/2017.
 */
public class Overload {
    public void f(){
        System.out.println("f ");
    }
    public  void f(int i ){
        System.out.println(i);
    }

    public void  f(float f,int i){
        System.out.println(f +"   "+ i);
    }

    public void  f(int i ,int j){
        System.out.println(i+"   "+j);
    }

    public static void f1(){
        System.out.println("f1");
    }
    public static void f1(String s){
        System.out.println(s);
    }

    public final void f1(boolean a){
        System.out.println(a);
    }

    public float f(int i ,float j){
        return i+j;
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        o.f();
        o.f(123);
        o.f(0.1f,100);
        o.f(123,321);
        System.out.println(o.f(123,100.1f));
        Overload.f1();
        Overload.f1("haha");
    }
}


