package com.udemy.IntroducaoPOO.ex2.application;

import java.util.Scanner;
import com.udemy.IntroducaoPOO.ex2.entities.Product;

public class Program {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);
        
        sc.close();
    }
}