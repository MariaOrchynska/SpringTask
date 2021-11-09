package com.intend.spring.Service;

import com.intend.spring.machines.Aerostart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AerostatTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("Checking  Aerostat ");
        Aerostart aerostart=(Aerostart) context.getBean("aerostat");
        aerostart.fuelConclusion();
        System.out.println(aerostart.getStatus());
    }

}
