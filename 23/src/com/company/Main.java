package com.company;

public class Main {

    public static void main(String[] args) {
	    DLinkedList list = new DLinkedList();

        list.add("Hello");
        list.add("world");
        list.add("and");
        list.add("let");
        list.add("the");
        list.add("force");
        list.add("be");
        list.add("with");
        list.add("you!");

        list.print();
        list.del(5);
        list.print();
    }



}
