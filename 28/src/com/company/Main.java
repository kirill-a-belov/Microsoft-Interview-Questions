package com.company;

public class Main {

    //Algorithm, complexity - O(n)
    static void toUpperCase(char[] input)
    {
        char[] alphabet = "aAAbBBcCCdDDeEEfFFgGGhHHiIIjJJkKKlLLmMMnNNoOOpPPqQQrRRsSStTTuUUvVVwWWxXXyYYzZZ".toCharArray();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j <alphabet.length ; j++) {
                if (input[i] == alphabet[j]){
                    input[i]= alphabet[j+1];
                    j = alphabet.length;
                }
            }
        }
    }

    public static void main(String[] args) {
	    char[] sequence = "Hello World and let the Force be with You!".toCharArray();
        System.out.println(sequence);
        System.out.println();
        toUpperCase(sequence);
        System.out.println(sequence);
    }
}
