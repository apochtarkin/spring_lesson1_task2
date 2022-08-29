package org.example;

import org.springframework.stereotype.Component;

@Component
public class HatchBackProductionLine implements ProductionLine{
    @Override
    public Car work() {
        //System.out.println("HATCHBACK built");
        return new Car();
    }
}
