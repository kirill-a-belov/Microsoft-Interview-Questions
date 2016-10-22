package com.company;

import java.util.Random;

public class Main {

    static int rand_n(int n){
        Random random = new Random();
        return random.nextInt(n)+1;
    }
    //Algorithm, complexity - O(n)
    static void permutation(int[] arr,int n){
        int temp=0;
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            index = rand_n(n)-1;
            temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        System.out.println();
        System.out.println("Permuted:");
        for (int x:
                arr) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
	    int n = 10;
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        for (int x:
             arr) {
            System.out.print(x+" ");
        } permutation(arr,n);
    }
}
