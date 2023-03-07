package com.magnuszakariassen.architecture.readability.initial;

import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        doStuff();
    }

    public static ArrayList<ArrayList<Integer>> doStuff(){
        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<= 7; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            for (int j = 0; j<=7; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        curr.add(1);
                    } else {
                        curr.add(0);
                    }
                } else {
                    if (j % 2 == 0) {
                        curr.add(0);
                    } else {
                        curr.add(1);
                    }
                }
            }
            System.out.println(curr);
            b.add(curr);
        }
        return b;
    }
}
