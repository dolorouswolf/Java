/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd.stack;

/**
 * rodney在02/03/2017创建。
 */
public class LinkedStack {
    private Node top;

    public LinkedStack(){
        //链栈的栈底是一个null的节点，如果一个节点next是null 则栈为空
        this.top = new Node();
    }

    public void push(int i){
        Node node = new Node(i);
        node.next = top;
        top = node;
    }

    public Node pop(){
        Node node = top;
        node.next = null;
        top = top.next;
        return node;
    }

    public boolean isEmpty(){
        return top.next == null;
    }

    public Node peek(){
        return top;
    }

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(123);
        linkedStack.push(124);
        linkedStack.push(125);
        System.out.println(linkedStack.peek().data);
        System.out.println(linkedStack.isEmpty());
        System.out.println(linkedStack.pop().data);
        System.out.println(linkedStack.pop().data);
        System.out.println(linkedStack.pop().data);
        System.out.println(linkedStack.isEmpty());
    }
}

class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
    }

    public Node(){
        this.data = 0;
        this.next = null;
    }
}