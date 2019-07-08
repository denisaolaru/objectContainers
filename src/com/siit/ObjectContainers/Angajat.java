package com.siit.ObjectContainers;

public class Angajat extends Persoana {

    public Angajat(String name, int age, String cnp) {
        super(name, age, cnp);
    }

    @Override
    public void setName(String name) {
        super.setName("angajat");
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
