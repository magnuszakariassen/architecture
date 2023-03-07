package com.magnuszakariassen.architecture.fruit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Orange")
public class Orange implements Cutable {
    @Override
    public void cut() {
        System.out.println("Cuts the orange");
    }
}
