package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

public class Checkupper {
    @Pointcut("@annotation(com.intend.spring.interfaces.Definer)")
    private void allaparatsPoint() {
    }
    @After("defineMach()")
    public void checkUpConclusion(){
        System.out.println("CheckUpper  said :");
    }
}
