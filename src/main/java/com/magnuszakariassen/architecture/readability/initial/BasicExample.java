package com.magnuszakariassen.architecture.readability.initial;

public class BasicExample {
    public boolean doStuff() {
        for (int i = 1; i<7; i++) {
            if (i==3) {
                return true;
            }
        }
        return false;
    }
}
