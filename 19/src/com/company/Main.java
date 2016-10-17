package com.company;

public class Main {

    // Algorithm, complexity - O(n)
    static int bitCount(int num){
        int counter = 0;
        while (num!= 0){
            // If the last bit equal to 1, counter increase
            if ((num & 1) == 1) counter++;
            num = num >>> 1;
        }
        return counter;
        }
    public static void main(String[] args) {
	int num = 414748364; //00011000101110001000111011001100 /  n=14
        System.out.println(bitCount(num));
    }
}
