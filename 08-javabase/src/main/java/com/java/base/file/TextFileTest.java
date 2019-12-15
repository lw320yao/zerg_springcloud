package com.java.base.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TextFileTest {

    public static void main(String[] args) throws IOException {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",59000,1989,10,12);
        staff[2] = new Employee("Tony Testerd",44000,1982,12,12);

        try(PrintWriter out = new PrintWriter("employee.dat","UTF-8")){
            writeData(staff,out);
        }

        try(Scanner in = new Scanner(new FileInputStream("employee.dat"),"UTf-8")){
            readData(in);
        }

    }

    private static void writeData(Employee[] employees,PrintWriter out) throws IOException{
        out.println(employees.length);
        for(Employee employee:employees){
            writeEmployee(out,employee);
        }
    }

    private static Employee[] readData(Scanner in){
        int n = in.nextInt();
        in.nextLine();
        Employee[] employees = new Employee[n];
        for (int i=0;i<n;i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    public static void writeEmployee(PrintWriter out,Employee employee){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(employee.getHireDay());
        out.println(employee.getName() + "|" +employee.getSalary() + "|" + gregorianCalendar.get(Calendar.YEAR)
                + "|" + (gregorianCalendar.get(Calendar.MONTH) + 1) + "|" + gregorianCalendar.get(Calendar.DAY_OF_MONTH));
    }

    public static Employee readEmployee(Scanner in){
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        int year = Integer.parseInt(tokens[2]);
        int month = Integer.parseInt(tokens[3]);
        int day = Integer.parseInt(tokens[4]);
        Employee employee = new Employee(name, salary, year, month, day);
        System.out.println(employee);
        return employee;
    }
}
