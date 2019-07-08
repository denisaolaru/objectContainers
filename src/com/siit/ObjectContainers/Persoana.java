package com.siit.ObjectContainers;

import java.util.Objects;

public class Persoana implements Comparable <Persoana> {
    private String name;
    int age;
     private String cnp;

    public Persoana(String name, int age, String cnp) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String company) {
        this.cnp = company;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cnp='" + cnp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(cnp, persoana.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }



    @Override
    public int compareTo(Persoana o) {

        return name.compareTo(o.getName());
    }
}
