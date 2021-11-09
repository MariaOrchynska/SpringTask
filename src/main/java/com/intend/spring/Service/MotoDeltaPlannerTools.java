package com.intend.spring.Service;

import com.intend.spring.machines.MotoDeltaPlanner;
import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MotoDeltaPlannerTools {
    public void fly(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("Checking MotoDeltaPlanner ");
        MotoDeltaPlanner motoDeltaPlanner=(MotoDeltaPlanner) context.getBean("motoDeltaPlanner");
        motoDeltaPlanner.fuelConclusion();
        System.out.println(motoDeltaPlanner.getStatus());
    }
}
