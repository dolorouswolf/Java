/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd.queue;

/**
 * rodney在02/03/2017创建。
 */
public class ArrayQueue {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 10; i++) {
            queue.insert(i);
            System.out.println(queue.peekFront()+" "+queue.peekEnd());
        }

        for (int i = 0; i < 10; i++) {
            queue.remove();
            System.out.println(queue.peekFront()+" "+queue.peekEnd());

        }

    }

    private int[] array;// 内置数组
    private int front=0;// 头指针
    private int end  =-1;// 尾指针

    public ArrayQueue(){
        array = new int[10];
    }

    public void insert(int i ){
        array[++end] = i;
    }

    public int remove(){
        return array[front++] ;
    }

    public boolean isEmpty(){
        return (front==array.length || front ==0)?true:false;
    }

    public boolean isFull(){
        return (end == array.length-1)?true:false;
    }

    public int peekFront(){
        return array[front];
    }

    public int peekEnd(){
        return array[end];
    }
}
