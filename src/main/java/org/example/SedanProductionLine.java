package org.example;

public class SedanProductionLine implements ProductionLine{
    @Override
    public Car work() {
        System.out.println("SEDAN built");
        return new Car();
    }
}
