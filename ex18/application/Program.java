package application;
import java.util.Scanner;
import entities.Product;

public class Program{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt()

        System.out.printf("%s, %.2f, %d", product.name, product.price, product.quantity);

        sc.close()
    }
}