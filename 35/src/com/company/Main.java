package com.company;

public class Main {
    //Algorithm, complexity - O(n)
    static void makeUniq(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] == arr[i+1])arr[i] =0;
        }
        for (int x:
                arr) {
            if (x>0) System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
	int[] arr = new int[]{1,2,3,3,4,5,6,6,6,7,7,8,9,10,11,11,11,11,12,13,14,15,15};
        for (int x:
             arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        makeUniq(arr);
    }
}
