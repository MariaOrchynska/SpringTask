package com.intend.spring.machines;

import com.intend.spring.interfaces.Definer;
import com.intend.spring.interfaces.HighlighterAnn;
import org.springframework.stereotype.Component;

@Component
public class MotoDeltaPlanner {
    public String nameOf() {
        return "MotoDeltaPlanner";
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
