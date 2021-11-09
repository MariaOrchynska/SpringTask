package com.intend.spring.Service;

import com.intend.spring.machines.Plane;
import com.intend.spring.machines.Planner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlannerTools {
    public void fly(){
    ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
    System.out.println("Checking Planner ");
    Planner planner=(Planner) context.getBean("planner");
    planner.fuelConclusion();
    System.out.println(planner.getStatus());
}
}
