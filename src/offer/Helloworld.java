/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;public class Helloworld {
    public static void main(String[] args) {

        String s="123";
        System.out.println("helloworld");
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append("12345").substring(1));
        System.out.println("123"=="123");
        String s1=new String("123");
        String s2=new String("123");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Integer i  = 100;
        Integer j = i;
        i=101;
        System.out.println(i);
        System.out.println(j);

        Integer x  = new Integer(100);
        Integer y  = new Integer(x);
        x = x+1;
        System.out.println(x);
        System.out.println(y);
    }
}
