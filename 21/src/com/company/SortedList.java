package com.company;

/**
 * Created by kirill on 18.10.2016.
 */
public class SortedList {

    private class Element{
        public int key;
        public String data;

        public Element(int key, String data) {
            this.key = key;
            this.data = data;
        }
    }
    private int count;
    private Element[] elements;

    public SortedList() {
        this.count = 0;
    }
    public void insert(int key, String data){
        this.count++;
        Element[] temp = new Element[this.count];
        for (int i = 0; i <this.count -1; i++) {
            temp[i] = this.elements[i];
        }
        temp[this.count -1] = new Element(key, data);
        this.elements = temp;
        this.sort();


    }
    public void print(){
        for (int i = 0; i <this.count; i++) {
            System.out.println(this.elements[i].key + " - "+this.elements[i].data);
        }
        System.out.println();
        System.out.println();
    }
    // Algorithm, complexity ~ O(n**2) (Insertion sort)
    private  void sort(){
        int j;
        Element temp;
        for (int i = 1; i < count; i++) {
            temp = elements[i];
            j = i;
            while ( (j > 0) && (elements[j-1].key > temp.key) ){
                elements[j] = elements[j-1];
                j = j-1;
            }
            elements[j]=temp;
        }
    }
}
