package com.intend.spring.machines;

import com.intend.spring.interfaces.Definer;
import com.intend.spring.interfaces.HighlighterAnn;

public class Balloon {
    public String nameOf() {
        return "Balloon";
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
