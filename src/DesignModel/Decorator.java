/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package DesignModel;

/**
 * Created by rodney on 20/02/2017.
 */
public class Decorator {
    public static void main(String[] args) {
        Person p = new Person("zm");

        Tshirt t = new Tshirt();
        Shoes shoes = new Shoes();
        t.decorator(p);
        shoes.decorator(t);
        t.show();
    }

}

class Person{
    private  String name;
    Person(){

    }
    Person( String  n){
        name = n;
    }
    public void show(){
        System.out.println(name+"的装扮");
    }
}
class cloth extends Person{
    Person p ;
    public void decorator(Person person){
        this.p = person;
    }
    @Override
    public void show() {

        if (p != null ) {
            super.show();
        }
    }
}

class Tshirt extends  cloth{
    @Override
    public void show() {
        System.out.println("Tshirt ");
        super.show();
    }
}

class Shoes extends   cloth{
    @Override
    public void show() {
        System.out.println("shoes");
        super.show();
    }
}