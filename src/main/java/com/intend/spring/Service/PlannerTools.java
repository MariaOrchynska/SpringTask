package com.intend.spring.Service;

import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlannerTools {
    public void fly(){
    ApplicationContext context = new AnnotationConfigApplicationContext();
    System.out.println("Checking Planner ");
    Plane plane=(Plane) context.getBean("planner");
    plane.fuelConclusion();
    System.out.println(plane.getStatus());
}
}
