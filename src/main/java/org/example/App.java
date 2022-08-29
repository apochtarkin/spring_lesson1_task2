package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AutoFactory carFactory = ctx.getBean("autoFactory", AutoFactory.class);
        carFactory.setProductionSize(2);
        AutoFactory carFactory1 = ctx.getBean("autoFactory1", AutoFactory.class);
        carFactory1.setProductionSize(4);
        carFactory.runProduction();
        carFactory1.runProduction();
        System.out.println("Created sedan = " + carFactory.getCreatedCars());
        System.out.println("Created hatchback = " + carFactory1.getCreatedCars());
    }
}
