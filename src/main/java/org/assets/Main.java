package org.assets;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Vehicle car = new Vehicle("my car","5/12/26",32500,"jeep cherokee", 8,77800);
        House house = new House("my house","5/12/26",587000.00,"7705 hamilton bridge road",2,4500,32670);

        List<Asset> myAssets = new ArrayList<>();

        myAssets.add(car);
        myAssets.add(house);

        for(Asset a: myAssets){
            if(a instanceof House){
                System.out.println(((House) a).getAddress());
            }
            if(a instanceof Vehicle){
                System.out.println(((Vehicle) a).getMakeModel());
            }
        }
    }


}
