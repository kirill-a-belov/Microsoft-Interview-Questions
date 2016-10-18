package com.company;

/**
 * Created by kirill on 17.10.2016.
 */


public class DLinkedList {
    private class Link {
        private  String data;
        private Link next;
        private Link prev;

        public Link(String data) {
            this.data = data;
        }
        public String getData() {
            return data;
        }
    }
    private Link first, last;


    public DLinkedList() {
        this.first = null;
    }
    public void add(String s){
        Link link = new Link(s);
        if(first==null){
            first = link;
            last = link;
        } else {
            last.next = link;
            link.prev = last;
            last = link;
        }
    }

    public void del(int index){
        Link prev = null;
        Link current = first;
        int currentIndex = 0;
        while( (current != null) && (currentIndex < index)) {
            currentIndex++;
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Out of bounds!");
        } else {
            prev.next = current.next;
            current.next.prev = prev;
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
}

