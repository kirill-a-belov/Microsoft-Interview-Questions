package com.company;

public class Main {

    public static void main(String[] args) {

        /* The tree:
        	        1
	            /       \
               2        3
             /   \    /  \
           4      5  6    7
         /  \   /  \     /
       8     9 10   11  12
	                     \
                          13
        Depth - 5

        */
        BinaryTree tree = new BinaryTree();

        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
