package com.company;

public class Main {

    //Algorithm - complexity O(1)
    public static void isPowerOf2(int i) {
        if ((i != 0) && ((i & (i-1)) == 0)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }

    public static void main(String[] args) {
        int i = 134217728;
        isPowerOf2(i);
    }
}
