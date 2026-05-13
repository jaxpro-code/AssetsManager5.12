package org.assets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void getVehicleVaule() {
        //arrange
        Vehicle car = new Vehicle("my car", "5/13/26", 30000, "jeep Cherokee", 8, 77500);
        Vehicle car2 = new Vehicle("my car", "5/13/26", 30000, "jeep Cherokee", 2, 77500);
        Vehicle car3 = new Vehicle("my car", "5/13/26", 30000, "jeep Cherokee", 4, 77500);
        Vehicle car4 = new Vehicle("my car", "5/13/26", 30000, "jeep Cherokee", 11, 77500);

        //act
        double testValue = car.getVaule();
        double testValue2 = car2.getVaule();
        double testValue3 = car3.getVaule();
        double testValue4 = car4.getVaule();

        //assert
        assertEquals(27600,testValue);
        assertEquals(29100,testValue2);
        assertEquals(28200,testValue3);
        assertEquals(1000,testValue4);


    }
}