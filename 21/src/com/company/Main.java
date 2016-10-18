package com.company;

public class Main {

    public static void main(String[] args) {
        SortedList list = new SortedList();

        list.insert(1, "Hello");
        list.insert(2, "world");
        list.insert(3, "and");
        list.insert(4, "let");
        list.insert(5, "the");
        list.insert(6, "force");
        list.insert(7, "be");
        list.insert(8, "with");
        list.insert(9, "you!");
        list.print();

        list.insert(3, "Woooo-Hoooo");
        list.print();




    }
}
