package com.udemy.IntroducaoPOO.ex04.application;

import java.util.Scanner;
import com.udemy.IntroducaoPOO.ex04.entities.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        sc.close();
    }
}
