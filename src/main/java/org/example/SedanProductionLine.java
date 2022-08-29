package org.example;

import org.springframework.stereotype.Component;

@Component("sedanPL")
public class SedanProductionLine implements ProductionLine{
    @Override
    public Car work() {
        //System.out.println("SEDAN built");
        return new Car();
    }
}
