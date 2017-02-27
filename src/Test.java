/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

/**
 * Created by rodney on 27/02/2017.
 */
public class Test {
    //查找次数
    public int count;

    public static void main(String[] args) {
        int[] iarray = {1, 2, 4, 5, 8, 11, 19, 40,99,101,102};

        Test test = new Test();
        test.bSearch(iarray,0,iarray.length-1,100);
        test.count=0;
    }

    public void bSearch(int[] array,int start ,int end ,int key){
        int tmp  = (end-start)/2;
        int mid = tmp+ start;
        //tmp ==0 表示无法继续二分
        count++;
        System.out.println("查找"+count+"次：");
        System.out.println("start:"+start+" "+array[start]+" end:"+end+" "+array[end]+" mid:"+mid+" "+array[mid]);

        if(array[mid] == key ){
            System.out.println("result :  "+array[mid]);
            return;
        }

        if(array[mid] != key && tmp ==0 ){
            System.out.println("no result found");
            return;
        }

        if(array[mid] < key){
            bSearch(array,mid,end,key);
        }

        if(array[mid] > key){
            bSearch(array,start,mid,key);
        }

    }
}
