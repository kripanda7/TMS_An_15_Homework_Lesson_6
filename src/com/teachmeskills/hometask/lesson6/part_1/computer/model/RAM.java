package com.teachmeskills.hometask.lesson6.part_1.computer.model;

public class RAM {
    private String name;
    private int value;

    public RAM() {

    }

    public RAM(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public void setValue(int value) {
        this.value = value;
    }
}
