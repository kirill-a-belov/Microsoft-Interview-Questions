package com.company;

public class Main {

    //Algorithm, complexity - O(n**2)
    static void reverse(char[] arr,int i) {
       int j = 0;
        for (char x:
             arr) {
            ++j;
            if (j==i){
                System.out.print(x);
                break;
            }
        }
        if (i!=0) reverse(arr,i-1);
    }


    public static void main(String[] args) {

        char[] arr = "Hello world and let the force be with you!".toCharArray();
        reverse(arr,arr.length);
    }
}
