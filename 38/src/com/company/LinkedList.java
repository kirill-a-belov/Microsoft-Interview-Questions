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
    public void printWithoutSpace(){
        Link current = first;
        while(current != null) {
            System.out.print(current.getData());
            current = current.next;
        }
        System.out.println("");
        System.out.println("");

    }
    // Algorithm, complexity - O(n)
    public void reverse (){
        Link current = this.first.next;
        Link prev = this.first;
        Link temp = null;
        this.first.next = null;

        while(current.next != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        temp.next = prev;
        this.first = temp;
    }
}

