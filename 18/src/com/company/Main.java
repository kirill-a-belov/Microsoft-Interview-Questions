package com.company;

public class Main {

    public static void reverse(String s) {
        reverse(s, 0);
    }

    // Algorithm< complexity - O(N)
    public static void reverse(String s, int first) {
        // Convert string to char array, it's easier to work
        char[] c = s.toCharArray();
        int last;
        last = first;
        // "Cut" a world from sentence
        while ((c[last] != ' ') && (last != s.length() - 1)) {
            last++;
        }
        //If it's the end of sentence - print without space, else - print with space and recursion
        if (s.length() - last > 1) {
            for (int i = last - 1; i >= first; i--) {
                System.out.print(c[i]);
            }
            System.out.print(c[last]);
            reverse(s, last + 1);
        } else {
            for (int i = last; i >= first; i--) {
                System.out.print(c[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "Hello   World! ...  and let    the force be with U!";
        reverse(s);
    }
}
