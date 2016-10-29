package com.company;

public class Main {

    //Algorithm complexity - O(n!)
    static void permutation(char[] c, int pos){
      if (pos == c.length-1){
          print(c);
      } else {
          for (int i = pos; i < c.length; i++) {
            char temp = c[pos];
              c[pos]=c[i];
              c[i]=temp;
              permutation(c,pos+1);
              temp = c[pos];
              c[pos]=c[i];
              c[i]=temp;
          }
      }
    }

    static void print(char[] c){
        for (char x:
                c) {
            System.out.print(x);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        String s = "ABCD";

        System.out.println(s);
        System.out.println(" ");
        permutation(s.toCharArray(),0);

    }
}
