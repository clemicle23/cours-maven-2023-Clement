package fr.imt.coffee.machine;

import fr.imt.coffee.machine.component.BeanTank;
import fr.imt.coffee.machine.component.Tank;
import fr.imt.coffee.machine.component.WaterPump;
import fr.imt.coffee.machine.component.WaterTank;
import fr.imt.coffee.storage.cupboard.coffee.type.CoffeeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterPumpTest {

    private WaterPump waterPump;
    private WaterTank waterTank;

    @BeforeEach
    public void resetTank(){
        waterPump = new WaterPump(10);
        waterTank = new WaterTank(10.0, 0.0, 50.0);
    }

    @Test
    void pumpWater() throws InterruptedException {
        waterPump.pumpWater(1.0,waterTank);
        assertEquals(waterTank.getActualVolume(),9.0);
    }
}