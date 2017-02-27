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

        //此时不能处理i=(iarray.length/2-1)  因为最后一个子树可能没有右节点 直接i*2+2 会数组越界
        for (int i = 0; i < (iarray.length / 2 - 1); i++) {
            //乘以2 是因为每一个父节点都会有两个子节点
            nodeList.get(i).leftChild = nodeList.get(i * 2 + 1);
            nodeList.get(i).rightChild = nodeList.get(i * 2 + 2);
        }

        int lastParentIndex = iarray.length / 2 - 1;
        // 左孩子
        nodeList.get(lastParentIndex).leftChild = nodeList
                .get(lastParentIndex * 2 + 1);
        // 右孩子,如果数组的长度为奇数才建立右孩子
        if (iarray.length % 2 == 1) {
            nodeList.get(lastParentIndex).rightChild = nodeList
                    .get(lastParentIndex * 2 + 2);
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
