/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd.stack;

import java.util.EmptyStackException;

/**
 * rodney在02/03/2017创建。
 */
public class ArrayStack {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(1);
        arrayStack.push(1);
        arrayStack.push(2);
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.isEmpty());
    }

    private int[] array;
    //关键，用来指向栈顶
    private int top = -1;

    public ArrayStack(int i) {
        this.array = new int[i];
    }

    public ArrayStack() {
        this.array = new int[10];
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return array[top--];
    }

    public void push(int i) {
        try {
            array[++top] = i;
        } catch (Exception e) {
            throw  new StackOverflowError();
        }
    }

    public int peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    public boolean isEmpty() {
        if (top != -1) {
            return false;
        } else {
            return true;
        }
    }
}
