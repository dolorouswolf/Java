/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd.sort;

/**
 * rodney在02/03/2017创建。
 */
public class Bubble {
    //冒泡排序时间复杂度 N^2
    public static void main(String[] args) {
        int[] a = {1, 321, 12, 534, 76, 876, 234, 12, 43, 6};
        for (int i = 0; i < a.length; i++) {
            //a.length-i 表示已经排好的数字不再比较
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
