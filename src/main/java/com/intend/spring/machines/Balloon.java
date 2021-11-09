package com.intend.spring.machines;

import com.intend.spring.interfaces.Definer;
import com.intend.spring.interfaces.HighlighterAnn;
import org.springframework.stereotype.Component;

@Component
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
