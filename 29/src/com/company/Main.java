package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedList list = new LinkedList();

        list.add('a');
        list.add('b');
        list.add('a');
        list.add('c');
        list.add('c');
        list.add('a');
        list.add('c');
        list.add('d');
        list.add('b');

        list.print();
        list.getUnique();

    }



}
