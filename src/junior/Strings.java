/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */
public class Strings {
    public static void main(String[] args) {
        char[] helloArray = {'1','a','2','b'};
        String s  = new String(helloArray);
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.concat("2b2b2b"));
        System.out.println(s);

        //formate
        String fs;
        fs = String.format("%s,%d,%s","123",123,"abc");
        System.out.println(fs);

        //compare
        System.out.println(s.compareTo("123"));
    }
}
