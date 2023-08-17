package com.teachmeskills.hometask.lesson6.part_1.store_service;

import com.teachmeskills.hometask.lesson6.part_1.store_service.model.container.ShipContainer;
import com.teachmeskills.hometask.lesson6.part_1.store_service.model.store.Warehouse;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");

        Warehouse warehouse1 = new Warehouse();

        ShipContainer container1 = new ShipContainer();
        ShipContainer container2 = new ShipContainer();
        ShipContainer container3 = new ShipContainer();

        ShipContainer[] containers = new ShipContainer[3];
        containers[0] = container1;
        containers[1] = container2;
        containers[2] = container3;

        warehouse1.setContainers(containers);
        warehouse1.addContainers(containers);
        System.out.println(warehouse1.getAllContainersPrice());

        System.out.println("End");
    }
}
