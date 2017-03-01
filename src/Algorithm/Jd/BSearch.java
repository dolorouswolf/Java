/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd;

import java.util.Arrays;

/**
 * Created by rodney on 23/02/2017.
 */
public class BSearch {
    public int count = 0;

    public static void main(String[] args) {
        int[] iarray = {1, 2, 5, 9, 11, 15, 18, 19, 20, 21};
        System.out.println("测试不存在的key");
        System.out.println("result:   " + BSearch.bsearch(iarray, 0, iarray.length - 1, 10));
        System.out.println("测试整个数组的值");
        for (int i = 0; i < iarray.length; i++) {
            int result = 0;
            result = BSearch.bsearch(iarray, 0, iarray.length - 1, iarray[i]);
            System.out.println("result:  " + result);
        }
        System.out.println("循环二分查找：");
        int result1 = 0;
        System.out.println("测试不存在的key");
        result1 = BSearch.bSearchLoop(iarray, 0, iarray.length - 1, 10);
        System.out.println("result1:  " + result1);
        System.out.println("测试整个数组的值");
        for (int i :
                iarray) {
            int result2 = 0;
            result2 = BSearch.bSearchLoop(iarray, 0, iarray.length - 1, i);
            System.out.println("result: " + result2);
        }
    }

    // 递归法  二分查找
    public static int bsearch(int[] array, int start, int end, int key) {

        int mid = (end + start) / 2;
        //默认找不到时返回-1
        int result = -1;
        if (start <= end) {
            System.out.println("Current: start[" + start + "] " + array[start]
                    + " end[" + end + "] " + array[end] +
                    " mid[" + mid + "]" + array[mid]);

            if (array[mid] < key) {
                result = bsearch(array, mid + 1, end, key);
            } else if (array[mid] > key) {
                result = bsearch(array, start, mid - 1, key);
            } else {
                result = mid;
            }
        }
        return result;
    }

    //循环法二分查找

    public static int bSearchLoop(int[] array, int start, int end, int key) {

        while (start <= end) {
            int mid = (end + start) / 2;
            System.out.println("Current: start[" + start + "] " + array[start]
                    + " end[" + end + "] " + array[end] +
                    " mid[" + mid + "]" + array[mid]);
            if (array[mid] < key) {
                start = mid + 1;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }


}
