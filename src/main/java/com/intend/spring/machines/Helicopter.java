package com.intend.spring.machines;

import com.intend.spring.interfaces.Definer;
import com.intend.spring.interfaces.HighlighterAnn;

public class Helicopter {
    public String nameOf() {
        return "Helicopter";
    }

    @Definer
    public String getStatus() {
        return "Ready";
    }

    @HighlighterAnn

    public void fuelConclusion() {
        System.out.println("Filled with petrol " + nameOf());
    }
}
