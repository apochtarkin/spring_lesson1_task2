package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AutoFactory carFactory = ctx.getBean("autoFactory", AutoFactory.class);
        carFactory.setProductionSize(7);
        carFactory.runProduction();
        System.out.println("Factory built " + carFactory.getCarsBuilt());
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
    }
}
