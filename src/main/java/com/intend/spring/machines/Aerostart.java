package com.intend.spring.machines;

import com.intend.spring.interfaces.Definer;
import com.intend.spring.interfaces.Highlighter;
import com.intend.spring.interfaces.HighlighterAnn;
import com.intend.spring.interfaces.MachInterface;
import org.springframework.stereotype.Component;

@Component
public class Aerostart implements Highlighter, MachInterface {

    public String nameOf() {
        return "Aerostat";
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