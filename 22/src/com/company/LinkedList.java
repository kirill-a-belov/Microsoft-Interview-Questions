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
    public void add(String s, int index){
        Link link = new Link(s);
        Link current = first;
        int currentIndex = 0;
        while( (current != null) && (currentIndex < index-1)) {
            currentIndex++;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Out of bounds!");
        } else {
            link.next = current.next;
            current.next = link;
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
        }
    }
    public String get(int index){
        Link current = first;
        int currentIndex = 0;
        while( (current != null) && (currentIndex < index)) {
            currentIndex++;
            current = current.next;
        }
        if (current == null) {
            return "Out of bounds!";
        } else {
            return current.data;
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

