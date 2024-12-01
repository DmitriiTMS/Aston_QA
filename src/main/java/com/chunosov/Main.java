package com.chunosov;

import com.chunosov.park.Park;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============TASK 1======================");
        Employee employee = new Employee("Jonov", "Jon", "Jonovich",
                "develop", "jon@gmail.com", "+133141414141414", 1000.20, 20);
        String infoEmployee = employee.getEmployeeInformation();
        System.out.println(infoEmployee);


        System.out.println("===============TASK 2======================");
        Employee employee1 = new Employee("Jonov", "Jon", "Jonovich",
                "develop", "jon@gmail.com", "+133141414141414", 1000.20, 20);
        Employee employee2 = new Employee("Benov", "Ben", "Benovich",
                "team-lead", "ben@gmail.com", "+13334353535", 2000.20, 30);
        Employee employee3 = new Employee("Timov", "Tim", "Timovich",
                "design", "tim@gmail.com", "+13334332553", 1400.20, 24);
        Employee employee4 = new Employee("Samov", "Sam", "Samovich",
                "acrobat", "sam@gmail.com", "+1335743838", 1500.20, 45);
        Employee employee5 = new Employee("Jackov", "Jack", "Jackovich",
                "tarolog", "jack@gmail.com", "+133575646468", 30000.20, 19);

        Employee[] employeesArray = {employee1, employee2, employee3, employee4, employee5};
        System.out.println(Arrays.toString(employeesArray));

        System.out.println("===============TASK 3======================");
        Park.Attraction attraction = new Park().new Attraction("Karusel", "10.00 - 20.00",
                new BigDecimal("23.23"));
        System.out.println(attraction);
    }
}