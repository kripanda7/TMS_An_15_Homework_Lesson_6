package com.teachmeskills.hometask.lesson6.part_2.model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String groupNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(passportNumber, student.passportNumber) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(groupNumber, student.groupNumber);
    }

    public Student(String firstName, String lastName, String passportNumber, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.groupNumber = groupNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, passportNumber, groupNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", passportNumber=" + passportNumber +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
