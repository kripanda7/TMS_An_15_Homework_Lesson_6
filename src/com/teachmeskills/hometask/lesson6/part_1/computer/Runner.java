package com.teachmeskills.hometask.lesson6.part_1.computer;

import com.teachmeskills.hometask.lesson6.part_1.computer.model.Computer;
import com.teachmeskills.hometask.lesson6.part_1.computer.model.HDD;
import com.teachmeskills.hometask.lesson6.part_1.computer.model.HDDType;
import com.teachmeskills.hometask.lesson6.part_1.computer.model.RAM;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");

        Computer computer1 = new Computer(700, "Lenovo");
        System.out.println(computer1);

        RAM ram = new RAM("Intel", 16);
        HDD hdd = new HDD("Toshiba", 1, HDDType.INTERNAL);
        Computer computer2 = new Computer(700, "Lenovo", ram, hdd);
        System.out.println(computer2);

        System.out.println("End");
    }
}
