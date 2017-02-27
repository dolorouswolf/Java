/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class Puppy {
    int age ;
    public Puppy(String name){
        System.out.println("puppy name " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("puppy age is " + this.age);
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("hashiqi");
        puppy.setAge(5);
        System.out.println(        puppy.getAge());
    }
}

