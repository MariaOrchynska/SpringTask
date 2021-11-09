package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Checkupper {
    @Pointcut("@annotation(com.intend.spring.interfaces.Definer)")
    private void allaparatsPoint() {
    }
    @Before("allaparatsPoint()")
    public void checkUpConclusion(){
        System.out.println("CheckUpper  said :");
    }
}
