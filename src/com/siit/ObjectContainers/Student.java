package com.siit.ObjectContainers;

public class Student extends Persoana {
    public Student(String name, int age, String cnp) {
        super(name, age, cnp);
    }

    @Override
    public void setName(String name) {
        super.setName("student");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
