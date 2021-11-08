package com.intend.spring.Service;

import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DerigableTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext();
        System.out.println("Checking Derigable ");
        Plane plane=(Plane) context.getBean("derigable");
        plane.fuelConclusion();
        System.out.println(plane.getStatus());
    }
}
