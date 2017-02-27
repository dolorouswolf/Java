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
        for (int i = 0; i < iarray.length; i++) {
            BSearch.bsearch(iarray, 0, iarray.length - 1, iarray[i]);
        }
    }

    // 递归法  二分查找
    public static void bsearch(int[] array, int start, int end, int key) {

        int tmp = (end - start) / 2;
        int mid = tmp + start;

        System.out.println("Current: start[" + start + "] " + array[start]
                + " end[" + end + "] " + array[end] +
                " mid[" + mid + "]" + array[mid]);

        //mid+1 考虑到当tmp=0 最后一组二分只有两个值，都要考虑是否与key 相同
        if (array[mid] == key || array[mid + 1] == key) {
            System.out.println("index:  " + mid + " result: " + key);
            return;
        }
        //最后一组两个值都不等于key时说明查找不到！ 返回
        if (tmp == 0) {
            System.out.println("no result found!!!!");
            return;
        }
        //中间值小于key，将中间值设为start
        if (array[mid] < key) {
            bsearch(array, mid, end, key);
        }

        //中间值大于key，将中间值设为end
        if (array[mid] > key) {
            bsearch(array, start, mid, key);
        }

    }

    //循环法二分查找

    public void bSearchLoop(int[] array, int start, int end, int key) {

        while ( (end - start) / 2  != 0) {
            int mid = (end - start) / 2 +start;
            if(array[mid] == key ){
                return;
            }

            if(array[mid] < key){
                start = mid;
            }

            if(array[mid] > key){
                end = mid;
            }
        }




    }


}
