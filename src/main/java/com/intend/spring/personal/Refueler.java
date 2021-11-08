package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

public class Refueler {
    @Pointcut("@annotation(com.intend.spring.interfaces.Definer)")
    private void defineMach() {
    }
    @After("defineMach()")
    public void fuelConclusion(){
        System.out.println("Refueler  said :");
    }
}
