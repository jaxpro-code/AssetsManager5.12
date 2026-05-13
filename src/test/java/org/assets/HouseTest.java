package org.assets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseTest {

    @Test
    public void getHouseVaule(){
        // arrange -- gather all the tools
        //excellent condition,55sqft,1000lot size
        House house = new House("my house","5/13/26",150000,"123 street",1,500,1000);
        House house2 = new House("my house","5/13/26",150000,"123 street",2,500,1000);
        House house3 = new House("my house","5/13/26",150000,"123 street",3,500,1000);
        House house4 = new House("my house","5/13/26",150000,"123 street",4,500,1000);

        // act -- run the test
        // run get value see what happens
        double testValue = house.getVaule();
        double testValue2 = house2.getVaule();
        double testValue3 = house3.getVaule();
        double testValue4 = house4.getVaule();

        //assert -- what i think the outcome will be
        // i assert the result will be 90250
        assertEquals(90250,testValue);
        assertEquals(65250,testValue2);
        assertEquals(45250, testValue3);
        assertEquals(40250,testValue4);

        // cover everything
        //cover all conditions or possible logic pathways
    }


}