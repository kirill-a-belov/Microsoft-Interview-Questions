package com.company;

import java.util.Random;

public class Main {

    //Algorithm, complexity ~ O(n log n) (mod of quick sort, approximately 1.3 times faster than the classical)
    static void sort(int[] array, int left, int right, int x, int k) {
       int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        //Right subarray
        if((i<right) && (x < k)){
            sort(array, i, right,++x,k);
        }
        //Left subarray
        if ((j>left) && (x > 1)){
            sort(array, left, j,--x,k);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n= 30;
        int k = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(k)+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        sort(arr,0,n-1,k/2,k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
