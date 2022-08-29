package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public AutoFactory(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public void runProduction() {
        int carsBuilt = 0;
        while (carsBuilt < productionSize) {
            cars.add(productionLine.work());
            carsBuilt++;
        }
    }

    public int getProductionSize() {
        return productionSize;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    public int getCreatedCars() {
        return cars.size();
    }
}
