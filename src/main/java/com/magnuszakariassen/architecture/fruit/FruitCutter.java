package com.magnuszakariassen.architecture.fruit;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitCutter {

    private final List<Cutable> cutableFruits;

    public FruitCutter(List<Cutable> cutableFruits) {
        this.cutableFruits = cutableFruits;
    }

    public void cutAllFruit() {
        cutableFruits.forEach(Cutable::cut);
    }
}
