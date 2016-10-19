package com.company;

public class Main {

    //Algorithm, complexity - O(n)
    static char[] charCuter(char[] s1, char[] s2){
        char[] temp = new char[s2.length];
        char[] result;
        System.arraycopy(s2,0,temp,0,s2.length);
        int length = 0;
        int index = 0;
        for (int i = 0; i < s1.length ; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s2[j] == s1[i]) {
                 temp[j]='*';
                 ++length;
                }
            }
        }
        result = new char[s2.length-length];
        for (int i = 0; i <s2.length ; i++) {
            if (s2[i]==temp[i]){
                result[index] = s2[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char[] s1 = "olet".toCharArray();
        char[] s2 = "Hello world and let the force be with you!".toCharArray();

        System.out.println(s2);

        System.out.println(charCuter(s1,s2));

    }
}
