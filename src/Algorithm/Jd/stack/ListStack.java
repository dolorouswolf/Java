/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * rodney在02/03/2017创建。
 */
public class ListStack {
    private List<Integer> stack;

    ListStack(){
        stack = new ArrayList<>();
    }

    public void push(int i){
        stack.add(stack.size(),i);
    }

    public int pop(){
        return stack.remove(stack.size()-1);
    }

    public int peek(){
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.size() == 0 ? true : false;
    }

    public static void main(String[] args) {
        ListStack listStack = new ListStack();
        for (int i = 0; i < 5; i++) {
            listStack.push(i);
        }
        System.out.println(listStack.peek());
        System.out.println(listStack.isEmpty());

        for (int i = 0; i < 5; i++) {
            System.out.println(listStack.pop());
        }
        System.out.println(listStack.isEmpty());
    }
}
