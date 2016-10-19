package com.company;

/**
 * Created by kirill on 17.10.2016.
 */


public class LinkedList {
    private class Link {
        private  char data;
        private Link next;

        public Link(char data) {
            this.data = data;
        }
        public char getData() {
            return data;
        }
    }
    private Link first, last;


    public LinkedList() {
        this.first = null;
    }
    public void add(char s){
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
            System.out.print(current.getData()+" ");
            current = current.next;
        }
        System.out.println("");
        System.out.println("");

    }
    // Algorithm, complexity - O(n)
    public void getUnique (){
        int length = 0;
        int i = 0;
        boolean flag = false;
        Link current = first;
        while(current != null) {
            ++length;
            current = current.next;
        }
        char[] unique  = new char[length];
        current = first;
        while(current != null) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if (unique[j] == current.getData()){
                    flag= false;
                }
            }
            if (flag) {
                System.out.print(current.getData() + " ");
                unique[i] = current.getData();
                ++i;
            }
            current = current.next;
        }
    }
}

