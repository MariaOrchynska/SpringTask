package com.intend.spring.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        PlaneTools planeTools=new PlaneTools();
        planeTools.fly();
        AerostatTools aerostatTools= new AerostatTools();
        aerostatTools.fly();
        BalloonTools balloonTools = new BalloonTools();
        balloonTools.fly();
        DerigableTools derigableTools = new DerigableTools();
        derigableTools.fly();
        HelicopterTools helicopterTools= new HelicopterTools();
        helicopterTools.fly();
        MotoDeltaPlannerTools motoDeltaPlannerTools= new MotoDeltaPlannerTools();
        motoDeltaPlannerTools.fly();
        PlannerTools plannerTools= new PlannerTools();
        plannerTools.fly();


    }
}
