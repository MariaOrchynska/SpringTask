package com.intend.spring.Service;

import com.intend.spring.machines.Helicopter;
import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelicopterTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("Checking Helicopter ");
        Helicopter helicopter=(Helicopter) context.getBean("helicopter");
        helicopter.fuelConclusion();
        System.out.println(helicopter.getStatus());
    }
}
