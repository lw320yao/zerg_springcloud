package com.java.base.file;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(){}

    public Employee(String name,double salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(year,month-1,day);
        hireDay = gregorianCalendar.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
