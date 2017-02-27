/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package DesignModel;

/**
 * Created by rodney on 20/02/2017.
 */
public class Factory {
    public static void main(String[] args) {
        IFactory factory = new MyFactory();
        IProduct product=factory.creatproduct();
        product.productMethod();
        IProduct1 product1 = factory.creatproduct1();
        product1.productMethod();
    }
}

interface IFactory{
    public IProduct creatproduct();
    public IProduct1 creatproduct1();
}

interface IProduct{
    public void productMethod();
}
interface IProduct1{
    public void productMethod();
}

class MyFactory implements IFactory{
    @Override
    public IProduct creatproduct() {
        return new MyProduct();
    }

    @Override
    public IProduct1 creatproduct1() {
        return new MyProduct1();
    }
}
class MyProduct implements IProduct{
    @Override
    public void productMethod() {
        System.out.println("chanpin");
    }
}
class MyProduct1 implements  IProduct1{
    @Override
    public void productMethod() {
        System.out.println("chanpin1");
    }
}