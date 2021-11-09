package com.intend.spring.Service;

import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlaneTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("Checking plane ");
        Plane plane=(Plane) context.getBean("plane");
        plane.fuelConclusion();
        System.out.println(plane.getStatus());
    }
}
