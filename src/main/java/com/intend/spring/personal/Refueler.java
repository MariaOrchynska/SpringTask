package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Refueler {
    @Pointcut("@annotation(com.intend.spring.interfaces.Definer)")
    private void defineMach() {
    }
    @Before("defineMach()")
    public void fuelConclusion(){
        System.out.println("Refueler  said :");
    }
}
