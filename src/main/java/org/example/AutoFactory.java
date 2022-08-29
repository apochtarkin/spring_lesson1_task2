package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@Scope("prototype")
public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;
    private int carsBuilt = 0;

    @Autowired
    public AutoFactory(@Qualifier("sedanPL") ProductionLine productionLine) {
        this.productionLine = productionLine;
        productionSize = 5;
    }

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public void runProduction() {
        while (carsBuilt < productionSize) {
            if (productionLine.work().isPartsDelivered()) {
                carsBuilt++;
            }
        }
    }

    public int getProductionSize() {
        return productionSize;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    public int getCarsBuilt() {
        return carsBuilt;
    }
}
