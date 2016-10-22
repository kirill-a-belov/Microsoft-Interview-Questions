package com.company;

public class Main {

    //Algorithm, complexity - O(n) Integers in second compliment form.
    static void sum1(int[] arr){
        int sum = 0;
        for (int x:
             arr) {
            sum +=x;
        }
        System.out.println(sum);
    }
    //Integers NOT in second compliment form. (Overflow protection)
    static void sum2(int[] arr,int count){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((-2147483648 <=sum+arr[i]) && (sum+arr[i]<=2147483647)){
                sum+=arr[i];
                arr[i] =0;
                ++count;
            }
        }
        if (count < arr.length){
            sum2(arr,count);
        } else {
            System.out.println(sum);
        }
}
    public static void main(String[] args) {
	    // Test array, sum - 376.
        int[] arr = new int[]{2, 56, 87, 2147483647,15,99,105,1,-2147483648,12};
        sum1(arr);
        sum2(arr,0);
    }
}
