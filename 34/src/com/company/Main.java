package com.company;

public class Main {


    static void largest(String[] arr){
        String temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (comparator(arr[i],arr[i+1])){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("The largest one:");
        System.out.println(arr[arr.length-1]);
    }
    static void smallest(String[] arr){
        String temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (!comparator(arr[i],arr[i+1])){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("The smallest one: ");
        System.out.println(arr[arr.length-1]);
        System.out.println();
    }
    //Algorithms, complexity - O(n)
    static Boolean comparator(String  s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int length = (s1.length()>s2.length())?s2.length():s1.length();
        for (int i = 0; i <length ; i++) {
            // Char case protection (makes function char insensitive)
            if (c1[i]>96)c1[i]=(char)(c1[i]-32);
            if (c2[i]>96)c2[i]=(char)(c2[i]-32);
            if (c1[i] > c2[i]){
                return true;
            } else if (c1[i] < c2[i]){
                return false;
            }
        }
         return false;
    }

    public static void main(String[] args) {
	    String[] arr = new String[6];
        arr[0] = "Hello world";
        arr[1] = "and let";
        arr[2] = "the force";
        arr[3] = "will be";
        arr[4] = "With";
        arr[5] = "you!";

        for (String x:
             arr) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println();
        smallest(arr);
        largest(arr);
    }
}
