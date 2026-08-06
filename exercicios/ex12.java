package exercicios;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double A, B, C, pi = 3.14159;

        System.out.printf("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.printf("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.printf("Digite o valor de C: ");
        C = sc.nextDouble();
        
        System.out.printf("TRIANGULO: %.3f%n", (A*C)/2);
        System.out.printf("CIRCULO: %.3f%n", pi*Math.pow(C, 2));
        System.out.printf("TRAPEZIO: %.3f%n", ((A+B)*C)/2);
        System.out.printf("QUADRADO: %.3f%n", Math.pow(B, 2));
        System.out.printf("RETANGULO: %.3f%n", A*B);

        sc.close();
    }
}
