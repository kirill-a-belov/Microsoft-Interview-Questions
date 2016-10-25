package com.company;

/**
 * Created by kirill on 17.10.2016.
 */


public class LinkedList {
    private class Link {
        private  String data;
        private Link next;

        public Link(String data) {
            this.data = data;
        }
        public String getData() {
            return data;
        }
    }
    private Link first, last;


    public LinkedList() {
        this.first = null;
    }
    public void add(String s){
        Link link = new Link(s);
        if(first==null){
            first = link;
            last = link;
        } else {
            last.next = link;
            last = link;
        }
    }
    public void print(){
        Link current = first;
        while(current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
        System.out.println("");
        System.out.println("");

    }
    // Algorithm, complexity - O(n)
    public void middle (){
        int i = 0;
        Link current = first;
        while(current != null) {
            ++i;
            current = current.next;
        }
        int j = i/2;
        if (j>1) {
            current = first;
            while(j>1) {
                --j;
                current = current.next;
            }
            if ((i % 2) != 0) {
                System.out.println("The middle is: " + current.next.getData());
            } else {
                System.out.println("The middle between: " + current.getData() + " and "+ current.next.getData());
            }
        } else {
            System.out.println("List too short!");
        }
    }
}

