package com.company;

public class Main {

    //Algorithm complexity - O(n**k)
    static void permutation(char[] c, char[] set, int i){
        if (i<c.length){
            for (int j = 0; j < set.length; j++) {
                c[i] = set[j];
                permutation(c, set, i + 1);
            }
        } else print(c);

    }

    static void doPermutation(char[] set){
        char[] c = new char[set.length];
        for (int i = 0; i < c.length ; i++) {
            c[i]= set[0];
        }
        permutation(c,set,0);

    }

    static void print(char[] c){
        for (char x:
                c) {
            System.out.print(x);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        String s = "ABCD";

        System.out.println(s);
        System.out.println(" ");
        doPermutation(s.toCharArray());

    }
}
