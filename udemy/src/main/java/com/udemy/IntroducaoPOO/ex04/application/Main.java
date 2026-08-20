package com.udemy.IntroducaoPOO.ex04.application;

import java.util.Scanner;
import com.udemy.IntroducaoPOO.ex04.entities.Employee;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.printf("Employee: %s%n", emp);
        System.out.print("Which percentage o increase the salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data:" + emp);


        sc.close();
    }
}
