/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd;

/**
 * Created by rodney on 22/02/2017.
 */
public class LinkList {
    public Node head;
    public Node current;


    //链表添加元素
    public void add(int data){
        if(this.head !=null ) {
            this.current.next = new Node(data);
            this.current = this.current.next;
        }else{
            this.head = new Node(data);
            this.current = this.head;
        }
    }
    //链表遍历元素(从头节点开始遍历)
    public void printFromHead(){
        Node tmp = this.head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    //指定节点遍历
    public void print(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    //链表删除指定节点
    //直接 node = node.next;不行 因为node是形参，出了函数体就会被销毁
    public void delete (Node node){
        if(node != null){
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }


    public static void main(String[] args) {
        LinkList linkList  = new LinkList();
        for (int i = 0; i < 3; i++) {
            linkList.add(i);
        }
//        linkList.printFromHead();
//        linkList.print(linkList.head.next.next);

        linkList.delete(linkList.head.next);
        linkList.printFromHead();
        System.out.println("end");
    }

    class Node{
        private  int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }

}


