package com.intend.spring.Service;

import com.intend.spring.machines.Balloon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BalloonTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("Checking balloon ");
        Balloon balloon= (Balloon) context.getBean("balloon");
        balloon.fuelConclusion();
        System.out.println(balloon.getStatus());
    }
}
