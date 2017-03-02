/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package Algorithm.Jd;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rodney on 23/02/2017.
 */
public class BTree {
    int[] iarray = {1, 2, 3, 4, 5, 6, 7, 8};
    static List<Node> nodeList;

    public void createBTree() {
        nodeList = new LinkedList<>();
        for (int i = 0; i < iarray.length; i++) {
            nodeList.add(new Node(iarray[i]));
        }

        //
        for (int i = 0; i < (iarray.length / 2); i++) {
            //乘以2 是因为每一个父节点都会有两个子节点
            nodeList.get(i).leftChild = nodeList.get(i * 2 + 1);
            if (i == (iarray.length / 2 - 1) && (iarray.length % 2 == 0)) {
                //在最后一个父节点时需要判断总节点是否为偶数，如果偶数说明最后一个父节点没有右孩子
                break;
            }
            nodeList.get(i).rightChild = nodeList.get(i * 2 + 2);
        }

    }

    //先序遍历  根 左 右
    public static void preOrderTraverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }

    //中序遍历  左 根 右
    public static void inOrderTraverse(Node node) {
        if (node == null)
            return;
        inOrderTraverse(node.leftChild);
        System.out.print(node.data + " ");
        inOrderTraverse(node.rightChild);
    }


    //中序遍历  左 右 根
    public static void postOrderTraverse(Node node) {
        if (node == null)
            return;
        postOrderTraverse(node.leftChild);
        postOrderTraverse(node.rightChild);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BTree btree = new BTree();
        btree.createBTree();

        preOrderTraverse(nodeList.get(0));
        System.out.println("先序");
        inOrderTraverse(nodeList.get(0));
        System.out.println("中序");
        postOrderTraverse(nodeList.get(0));
        System.out.println("后序");
        System.out.println("end");
    }
}

class Node {
    Node leftChild;
    Node rightChild;
    int data;

    Node(int data) {
        this.data = data;
    }
}
