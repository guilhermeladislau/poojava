package exercicios;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor: ");
        int v1 = sc.nextInt();
        //sc.nextLine();
        System.out.printf("Digite o segundo valor: ");
        int v2 = sc.nextInt();
        int valor = v1 + v2;

        System.out.printf("Soma: %d%n", valor);





        sc.close();
    }
}
