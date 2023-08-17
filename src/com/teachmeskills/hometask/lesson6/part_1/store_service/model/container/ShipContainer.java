package com.teachmeskills.hometask.lesson6.part_1.store_service.model.container;

public class ShipContainer {
    // Fields
    int width;
    int length;
    int depth;
    String containerModel;
    public double price = 1000;

    // Constructors
    public ShipContainer() {
        System.out.println("Without parameters");
        this.width = 10;
        this.length = 20;
        this.depth = 30;
        this.containerModel = "Custom container";
    }

    public ShipContainer(int width, int length, int depth) {
        System.out.println("Without parameters");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Custom container";
    }

    public ShipContainer(int width, int length, int depth, String boxModel) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = boxModel;
    }

    public ShipContainer(int width, int length, int depth, String boxModel, double price) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = boxModel;
        this.price = price;
    }
}
