package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Repairer {



    @Pointcut("@annotation(com.intend.spring.interfaces.Definer)")
    private void defineMach() {
    }
    @After("defineMach()")
    public void repairConclusion(){
        System.out.println("Repairer  said : ");
    }
}
