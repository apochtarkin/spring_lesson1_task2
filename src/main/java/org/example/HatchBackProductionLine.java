package org.example;

public class HatchBackProductionLine implements ProductionLine{
    @Override
    public Car work() {
        System.out.println("HATCHBACK built");
        return new Car();
    }
}
