package com.java.base.file.serializable;

import java.io.*;

public class ObjectStreamTest {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Employee employee = new Employee("harry hacker",400030,1989,12,2);

        Manager carl = new Manager("carl cracker",123222,1990,2,10);
        carl.setSecretary(employee);
        Manager tony = new Manager("Tony Tester",349000,1992,3,11);
        tony.setSecretary(employee);

        Employee[] staff = new Employee[3];
        staff[0] = employee;
        staff[1] = carl;
        staff[2] = tony;

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.txt"))){
            outputStream.writeObject(staff);
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee.txt"))){
            Employee[] newStaff = (Employee[])inputStream.readObject();
            newStaff[1].raiseSalary(10);

            for(Employee employee1:newStaff){
                System.out.println(employee1);
            }
        }
    }

}
