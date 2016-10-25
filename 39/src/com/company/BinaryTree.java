package com.company;

/**
 * Created by kirill on 18.10.2016.
 */
public class BinaryTree {
    private class Node {
        public int data;
        public Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node top;
    private Node[] node = new Node[13];
    private int depth;

    public BinaryTree() {
        for (int i = 0; i < 13 ; i++) {
            node[i] = new Node(i+1);
        }
        this.top = node[0];
        node[0].left = node[1];
        node[0].right = node[2];
        node[1].left = node[3];
        node[1].right = node[4];
        node[2].left = node[5];
        node[2].right = node[6];
        node[3].left = node[7];
        node[3].right = node[8];
        node[4].left = node[9];
        node[4].right = node[10];
        node[5].left = null;
        node[5].right = null;
        node[6].left = node[11];
        node[6].right = null;
        node[7].left = null;
        node[7].right = null;
        node[8].left = null;
        node[8].right = null;
        node[9].left = null;
        node[9].right = null;
        node[10].left = null;
        node[10].right = null;
        node[11].left = null;
        node[11].right = node[12];
        node[12].left = null;
        node[12].right = null;
    }

    // Algorithm, complexity - O(n)
    public void preOrder(){
        pre(this.top);
    }
    public void inOrder(){
        in(this.top);
    }
    public void postOrder(){
        post(this.top);
    }
    private void post(Node node){
        if (node.left != null) post(node.left);
        if (node.right != null) post(node.right);
        System.out.print(node.data+"|");
    }
    private void pre(Node node){
        System.out.print(node.data+"|");
        if (node.left != null) pre(node.left);
        if (node.right != null) pre(node.right);
    }
    private void in(Node node){
        if (node.left != null) in(node.left);
        System.out.print(node.data+"|");
        if (node.right != null) in(node.right);
    }
}
