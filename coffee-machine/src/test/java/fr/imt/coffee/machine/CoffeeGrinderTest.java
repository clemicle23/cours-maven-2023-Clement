package fr.imt.coffee.machine;

import fr.imt.coffee.machine.component.BeanTank;
import fr.imt.coffee.machine.component.CoffeeGrinder;
import fr.imt.coffee.machine.component.WaterPump;
import fr.imt.coffee.machine.component.WaterTank;
import fr.imt.coffee.storage.cupboard.coffee.type.CoffeeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeGrinderTest {
    private CoffeeGrinder coffeeGrinder;
    private BeanTank beanTank;

    @BeforeEach
    public void resetTank(){
        coffeeGrinder = new CoffeeGrinder(10);
        beanTank = new BeanTank(10.0, 0.0, 50.0, CoffeeType.ARABICA);
    }

    @Test
    void grindCoffee() throws InterruptedException {
        coffeeGrinder.grindCoffee(beanTank);
        assertEquals(beanTank.getActualVolume(),9.8);
    }
}