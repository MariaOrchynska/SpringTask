package com.intend.spring.Service;

import com.intend.spring.machines.Derigable;
import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DerigableTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("Checking Dirigible ");
        Derigable derigable=(Derigable) context.getBean("dirigible");
        derigable.fuelConclusion();
        System.out.println(derigable.getStatus());
    }
}
