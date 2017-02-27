/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;

/**
 * Created by rodney on 18/02/2017.
 * 构造器不可override
 * 输出结果：
 * A
 * B
 * Constructor A
 * Constructor B
 * Constructor A
 * Constructor B
 */
public class Constructor {
    public static void main(String[] args) {
        A a = new B();
        try{
            a.F();
        }catch (Exception e){
            e.printStackTrace();
        }
        a.a();
        //a.b();  找不到b（）函数
        B b = new B();
        b.b();
        b.a();

    }

}

//父类
class A  {
    static {
        System.out.println("A");
    }
    String []aa = new String[5];
    public A(String s ){
        System.out.println("Constructor A");
    }

    public void F() throws Exception{
        System.out.println("fdsafdsaf");
    }

    public void a(){
        System.out.println("private a");
    }
    //同类名的函数
    public void A(){
        System.out.println("same as class name");
    }
}

//子类
class B extends  A {
    static {
        System.out.println("B");
    }
    /*父类没有默认构造函数时必须先调用父类指定函数否则会报错： 父类构造函数缺少参数（
    因为空参数的默认构造函数，会自动找有参数的构造参数，而没有传进去参数就出错了）
    所以需要显视调用super("string")
    */
    public B(){
        super("123");
        System.out.println("Constructor B");
        try{
            super.F();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public B(String s){
        super(s);
        System.out.println(s);
    }

    public void F() {
        System.out.println("jhhhh");

    }

    public void b(){
        System.out.println("B private");
    }
}



