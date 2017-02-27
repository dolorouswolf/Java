/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;/**
 * Created by rodney on 18/02/2017.
 *   father`s  function f is Overrided by child
 */
public class Override {
    public static void main(String[] args) {
        Father f = new Child();
        f.f();

    }

}

class Father {
    public  void f (){
        System.out.println("i`m daddy");
    }
    public  void f1 (){
        System.out.println("f1");
    }

}

class   Child extends Father {
    public  void f (){
        System.out.println("i`m child ");
    }
    public  void f1(){
        System.out.println("f2");
    }
}


