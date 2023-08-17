package com.teachmeskills.hometask.lesson6.part_2;

import com.teachmeskills.hometask.lesson6.part_2.model.Student;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");

        Student student1 = new Student("Dmitry", "Kripan", "abc123", "An_15");
        Student student2 = new Student("Dmitry", "Kripan", "abc123", "An_15");
        Student student3 = new Student("Dmitry", "Kripan", "abc321", "An_14");

        if (student1.equals(student2)) {
            System.out.println("Student1 is equals Student2.");
        }

        if (!student1.equals(student3)) {
            System.out.println("Student1 is not equals Student3.");
        }

        System.out.println("End");
    }
}
