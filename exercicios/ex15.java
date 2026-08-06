package exercicios;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i, soma = 0;

        System.out.printf("Digite um numero para a soma: ");
        for(i = 0; i < 3; i++){
            soma += sc.nextInt();
            System.out.printf("Digite outro numero: ");
        }
        System.out.printf("A soma deu %d", soma);


    }
}
