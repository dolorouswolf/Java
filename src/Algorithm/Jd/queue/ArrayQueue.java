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
            System.out.println(queue.peekFront() + " " + queue.peekEnd());
        }

        for (int i = 0; i < 5; i++) {
            queue.remove();
            System.out.println(queue.peekFront() + " " + queue.peekEnd());

        }

        for (int i = 10; i < 15; i++) {
            queue.insert(i);
            System.out.println(queue.peekFront() + " " + queue.peekEnd());
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }

    private int[] array;// 内置数组
    private int front = 0;// 头指针
    private int end = -1;// 尾指针
    private int count = 0; //队列中个数

    public ArrayQueue() {
        array = new int[10];
    }

    public void insert(int i) {
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        if (end == array.length - 1) {
            end = 0;
        } else {
            end++;
        }
        array[end] = i;
        count++;
    }

    public int remove() {
        int tmp = array[front];
        if (front == array.length - 1) {
            front = 0;
        } else {
            front++;
        }
        count--;
        return tmp;
    }

    public boolean isEmpty() {
        return (count == 0) ? true : false;
    }

    public boolean isFull() {
        return (count == array.length) ? true : false;
    }

    public int peekFront() {
        return array[front];
    }

    public int peekEnd() {
        return array[end];
    }
}
