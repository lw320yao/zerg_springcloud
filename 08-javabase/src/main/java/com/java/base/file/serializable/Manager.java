package com.java.base.file.serializable;

public class Manager extends Employee {

    private Employee secretary;

    public Manager(String name, double salar, int year, int month, int day) {
        super(name, salar, year, month, day);
        this.secretary = null;
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "secretary=" + secretary +
                '}';
    }
}
