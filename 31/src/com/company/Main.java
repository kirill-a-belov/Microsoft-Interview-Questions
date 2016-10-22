package com.company;

import java.util.Random;

public class Main {
    // Print test array
    static void arrayPrint(int[] arr){
        for (int x :
                arr) {
            System.out.print(x + " ");

        }
        System.out.println(" ");
        System.out.println(" ");
    }

    // Algorithm, complexity - O(n) (mod. version of 14.)
    static void findDuplicates(int[] arr,int n){
        if (n == arr.length)++n;
        if (n > arr.length){ // If (k<n), expand the array to use effective algorithm
           int[] temp = new int[n+2];
           for (int i = 0; i < arr.length; i++) {
               temp[i] = arr[i];
           }
           for (int i = arr.length; i <n+2; i++) {
               temp[i] = n+1;
           }
           arr=temp;
        }
        System.out.println("Compressed array:");
        int j;
        for (int i = 0; i < arr.length; i++) {
            j =((arr[i]>0)? arr[i]:(-1*arr[i])); // If it needs, turn an index to positive (to avoid null pointer exception)
            if (arr[j] > 0){
                arr[j] = arr[j] * (-1); // Mark a duplicate by changing a sign
                if (j<= n) System.out.print(j+" ");
            }
        }
    }

    public static void main(String[] args) {
        // Test random array. Size - k, values in 1..n;
        Random random = new Random();
        int k = 9;
        int n = 10;
        int[] arr = new int[k];
        for (int j = 0; j < k; j++) {
            arr[j]= (random.nextInt(n)+1);
        }
        arrayPrint(arr);
        findDuplicates(arr,n);

    }
}