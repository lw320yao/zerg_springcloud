package com.java.base.file.serializable;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Serializable {

    private String name;
    private double salar;
    private Date hireDay;

    public Employee(){}

    public Employee(String name, double salar,int year,int month,int day) {
        this.name = name;
        this.salar = salar;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(year,month,day);
        this.hireDay = gregorianCalendar.getTime();
    }

    public void raiseSalary(double byPercent){
        double raise = salar * byPercent / 100 ;
        salar += raise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalar() {
        return salar;
    }

    public void setSalar(double salar) {
        this.salar = salar;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nake='" + name + '\'' +
                ", salar=" + salar +
                ", hireDay=" + hireDay +
                '}';
    }
}
