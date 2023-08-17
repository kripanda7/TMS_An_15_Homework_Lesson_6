package com.teachmeskills.hometask.lesson6.part_1.computer.model;

public class HDD {
    private String name;
    private int value;

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", type=" + type +
                '}';
    }

    private HDDType type;

    public HDD() {
    }

    public HDD(String name, int value, HDDType type) {
        this.name = name;
        this.value = value;
        this.type = type;
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

    public void setValue(int value) {
        this.value = value;
    }

    public HDDType getType() {
        return type;
    }

    public void setType(HDDType type) {
        this.type = type;
    }
}
