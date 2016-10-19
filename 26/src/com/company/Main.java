package com.company;

public class Main {

    static void spiralPrint (int[][] arr, int l1, int l2, int start ){


        if (l2 > 3) {
            for (int i = start; i <= (l2 - 1); i++) {
                System.out.print(arr[start][i] + " ");
            }
        } else {
            System.out.print(arr[start][start] + " ");
        }
        if (l1 > 3) {
            for (int i = (start+1); i <= (l1-1) ; i++) {
                System.out.print(arr[i][l2-1]+" ");
            }
        }
        if ((l1 > 3)&&(l2 > 3)) {
            for (int i = (l2-2); i >= start; i--) {
                System.out.print(arr[l1-1][i]+" ");
            }
        }
        if ((l1 > 3)&&(l2 > 3)) {
            for (int i = (l1-2); i > start; i--) {
                System.out.print(arr[i][start]+" ");
            }
        }
        if ((l1-1 > start+1) && (l2-1 > start+1)){
            spiralPrint(arr,l1-1,l2-1,start+1);
        }
    }

    public static void main(String[] args) {
	    int count = 0;
        int l1 = 5;
        int l2 = 8;
        int[][] arr = new int[l1][l2];
             for (int i = 0; i < l1; i++) {
                for (int j = 0; j < l2; j++) {
                    ++count;
                    arr[i][j] = count;
                    System.out.print(arr[i][j]+" ");
                }

             }
        System.out.println(" ");
        System.out.println(" ");
        spiralPrint(arr,l1,l2,0);
    }
 }
