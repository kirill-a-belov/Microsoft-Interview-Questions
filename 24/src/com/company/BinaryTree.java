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

    public int getMaxDepth(){
        int depth = 0;
        getDepth(this.top, depth);
        return this.depth;
    }
    // Algorithm, complexity - O(n)
    private void getDepth(Node current, int depth){
        ++depth;
        if (current.left != null){
            getDepth(current.left,depth);
        }
        if (current.right != null){
            getDepth(current.right,depth);
        }
        if (depth>this.depth){this.depth=depth;};
    }
}
