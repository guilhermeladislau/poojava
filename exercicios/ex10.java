package exercicios;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, hora;
        double valorHora, salario;

        System.out.printf("Digite o numero do funcionario: ");
        num = sc.nextInt();
        System.out.printf("Digite a quantidade de horas trabalhadas: ");
        hora = sc.nextInt();
        System.out.printf("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();
        
        salario = valorHora * (double) hora;

        System.out.printf("Numero do funcionario: %d%n", num);
        System.out.printf("Salario: %.2f%n", salario);

        sc.close();
    }
}
