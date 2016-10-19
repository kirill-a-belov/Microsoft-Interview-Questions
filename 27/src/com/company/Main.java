package com.company;

import java.util.Random;

public class Main {
    //Algorithm, complexity - O(n)
    static void shuffle(int[] deck, int deckSize){
        int[] deckShuffled = new int[deckSize];
        int i = 0;
        final Random random = new Random();
        int rnd;
        while (i < deckSize){
            rnd = random.nextInt(52);
            if (deck[rnd] != 0 ) {
                deckShuffled[i] = deck[rnd];
                deck[rnd] = 0;
                ++i;
            }
        }
        System.arraycopy(deckShuffled,0,deck,0,deckSize);
    }

    public static void main(String[] args) {
 	    int deckSize = 52;
        int [] deck = new int[deckSize];
        for (int i = 0; i < deckSize; i++) {
            deck[i] = i+1;
            System.out.print(deck[i]+" ");
        }
        System.out.println();
        System.out.println();
        shuffle(deck, deckSize);
        for (int i = 0; i < deckSize; i++) {
            System.out.print(deck[i]+" ");
        }
    }
}
