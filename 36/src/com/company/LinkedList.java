package com.company;

/**
 * Created by kirill on 17.10.2016.
 */


public class LinkedList {
    public class Link {
        private  int data;
        public Link next;

        public Link(int data) {
            this.data = data;
        }
        public int getData() {
            return data;
        }
    }
    public Link first, last;


    public LinkedList() {
        this.first = null;
    }
    public void add(int s){
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
    public boolean isElementInList(Link element){
        Link temp = first;
        while (temp!=null){
            if (temp.getData()==element.getData()) return true;
            temp = temp.next;
        }
        return false;
    }
}

