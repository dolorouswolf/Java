/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;

/**
 * Created by rodney on 18/02/2017.
 */
public class StaticValue {
    public static int staticVar = 0;
    public int instanceVar = 0;

    public StaticValue() {
        staticVar++;
        instanceVar++;
        System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
    }

    public static void main(String[] args) {
        StaticValue staticValue = new StaticValue();
        StaticValue staticValue1 = new StaticValue();
        StaticValue staticValue2 = new StaticValue();
        StaticValue staticValue3 = new StaticValue();

    }
}