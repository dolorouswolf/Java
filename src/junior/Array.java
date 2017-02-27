/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

import java.util.Arrays;

/**
 * Created by rodney on 20/02/2017.
 */
public class Array {
    public static void main(String[] args) {
        int[] a =  new int[100];
        int sum =0;
        for (int i :
                a) {
            sum += i;
        }
        System.out.println(sum);

        Arrays.fill(a,100);

        sum = 0;
        for (int i :
                a) {
            sum += i;
        }
        System.out.println(sum);
    }
}
