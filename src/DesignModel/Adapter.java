/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package DesignModel;

/**
 * Created by rodney on 20/02/2017.
 */
public class Adapter {
    NewInterface newInterface =new NewInterface();
    public void oldMethod (){
        newInterface.newMethod();
    }

    public static void main(String[] args) {
        OldInterface o = new OldInterface();
        Adapter a  = new Adapter();
        o.oldMethod();
        a.oldMethod();
    }
}

class OldInterface {
    public void  oldMethod (){
        System.out.println("old  method");
    }
}

class NewInterface {
    public void  newMethod (){
        System.out.println("new  method");
    }
}

