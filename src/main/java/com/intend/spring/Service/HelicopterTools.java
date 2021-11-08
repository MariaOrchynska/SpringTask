package com.intend.spring.Service;

import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelicopterTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext();
        System.out.println("Checking Helicopter ");
        Plane plane=(Plane) context.getBean("helicopter");
        plane.fuelConclusion();
        System.out.println(plane.getStatus());
    }
}
