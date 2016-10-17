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

    /*// Algorithm, complexity - O(n**2)
    static void findDuplicates(int[] arr){
        System.out.println("Duplicates are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -0;
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }*/
    // Algorithm, complexity - O(n)
    static void findDuplicates(int[] arr){
        System.out.println("Duplicates are:");
        int j;
        for (int i = 0; i < arr.length; i++) {
            j =((arr[i]>0)? arr[i]:(-1*arr[i])); // If it needs, turn an index to positive (to avoid null pointer exception)
            if (arr[j] > 0) {
                arr[j] = arr[j] * (-1); // Mark a duplicate by changing a sign
            } else {
                System.out.print(j+" ");
            }
        }
    }

    public static void main(String[] args) {
        // Test random array. Size - N
        Random random = new Random();
        int N = 50;
        int[] arr = new int[N];
        for (int j = 0; j < N; j++) {
            arr[j]= (random.nextInt(N-1)+1);
        }
        arrayPrint(arr);
        findDuplicates(arr);


    }
}