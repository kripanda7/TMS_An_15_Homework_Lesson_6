package com.teachmeskills.hometask.lesson6.part_1.store_service.model.store;

import com.teachmeskills.hometask.lesson6.part_1.store_service.model.container.ShipContainer;

public class Warehouse {
    // Fields
    public String address;
    public ShipContainer[] containers;


    // Constructors
    public Warehouse() {
        this.address = "Amsterdam";
    }

    // конструктор только с одним параметром - address
    public Warehouse(String address) {
        this.address = address;
    }

    public Warehouse(String address, ShipContainer[] containers) {
        this.address = address;
        this.containers = containers;
    }


    // Methods
    public void setContainers(ShipContainer[] containers) {
        System.out.println("Adding containers");
        this.containers = containers;
        System.out.println("Containers are added");
    }

    //метод добаваления новых контейнов в уже сущесвующий массив контейнеров
    public void addContainers(ShipContainer[] newContainers) {
        ShipContainer[] temp = new ShipContainer[containers.length + newContainers.length];
        for (int i = 0; i < temp.length; i++) {
            if (i < containers.length) {
                temp[i] = containers[i];
            } else {
                temp[i] = newContainers[i - containers.length];
            }
        }
        containers = temp;
    }

    // добавить метод для вывода стоимости всех контейнеров
    // возвращаемый тип данных - число с плавающей точкой
    public double getAllContainersPrice() {
        double sum = 0;
        for (ShipContainer container : containers) {
            sum += container.price;
        }
        return sum;
    }
}
