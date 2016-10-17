package com.company;

public class Main {

    // Algorithm
    static void maxSubArr(int[] arr){
        // Null array check
        if (arr == null || arr.length == 0) {
            System.out.println("Empty array");
            return;
        }
        // Variables init
        int FirstIndex = 0;
        int LastIndex = 0;
        int Sum = arr[0];
        int CurrentIndex = 0;
        int CurrentSum = arr[0];
        // One passthrough -  complexity O(n)
        for (int i=1; i<arr.length; i++) {
            CurrentSum += arr[i];
            if ( arr[i] > CurrentSum) { // If previous sum less than current element, moving a range
                CurrentSum = arr[i];
                CurrentIndex = i;
            }
            if (CurrentSum > Sum) { // If new element in a range increase it, than expand a range
                FirstIndex = CurrentIndex;
                LastIndex = i;
                Sum = CurrentSum;
            }
        }
        for (int i=FirstIndex; i<=LastIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("    = "+ Sum);

    }

    public static void main(String[] args) {
        // Test random array. Size - 10
        int[] i = {-2, 8, 1, -1, 0, 6, -15, 13};
        // Print test array
        for (int x :
                i) {
            System.out.print(x+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        maxSubArr(i);
    }
}
