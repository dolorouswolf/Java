/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

import java.io.Serializable;

/**
 * Created by rodney on 20/02/2017.
 */
public class OOP {
    public static void main(String[] args) {
        Dog d  = new Dog();
        d.name= "dog";
        if (d instanceof Animal) {
            Animal animal = (Animal) d;
            System.out.println(animal.name);
            System.out.println(d.name);
        }

        System.out.println( d instanceof  Serializable);

        //override
        Animal a = new Animal();
        Animal b =  new Dog();
        a.move();
        b.move();//animal的方法被子类覆盖时，引用的时子类的方法
//        b.bark();  animal中没有bark方法
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Dog);


        //多态：  父类引用 指向孩子，为了松耦合，其实就是工厂模式，只需修改传递的子类对象即可

        Person me = new Person();
        me.setPet(new Cat());
        me.play();
        me.setPet(new Dog());
        me.play();
    }
}
class Animal{
    public  String name;
    public  void move (){
        System.out.println("animal move");
    }
}



class Dog extends  Animal implements Serializable{
    public  String name;
    public  void move (){
//        super.move();
        System.out.println("dog move");
    }

    public void  bark(){
        System.out.println("wang wang");
    }
}

class Person{
    private Animal pet ;
    public  void play(){
        if(pet != null){
            this.pet.move();
        }
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
}

class Cat extends Animal{
    public String name;
    public void move(){
        System.out.println("cat move");
    }
}