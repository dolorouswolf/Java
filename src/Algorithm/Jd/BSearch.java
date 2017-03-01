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
        BSearch.bsearch(iarray, 0, iarray.length - 1, 10);
        System.out.println("测试整个数组的值");
        for (int i = 0; i < iarray.length; i++) {
            BSearch.bsearch(iarray, 0, iarray.length - 1, iarray[i]);
        }
    }

    // 递归法  二分查找
    public static int bsearch(int[] array, int start, int end, int key) {

        int mid = (end + start) / 2;


        if (start <= end) {
            System.out.println("Current: start[" + start + "] " + array[start]
                    + " end[" + end + "] " + array[end] +
                    " mid[" + mid + "]" + array[mid]);

            if (array[mid] < key) {
                bsearch(array, mid + 1, end, key);
            } else if (array[mid] > key) {
                bsearch(array, start, mid - 1, key);
            } else {
                System.out.println("resulet index:   " + mid);
                return mid;
            }
        }
        return -1;
    }

    //循环法二分查找

    public void bSearchLoop(int[] array, int start, int end, int key) {

        while ((end - start) / 2 != 0) {
            int mid = (end - start) / 2 + start;
            if (array[mid] == key) {
                return;
            }

            if (array[mid] < key) {
                start = mid;
            }

            if (array[mid] > key) {
                end = mid;
            }
        }


    }


}
