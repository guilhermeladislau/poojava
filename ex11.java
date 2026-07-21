import java.util.Scanner;

public class ex11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int cod1, cod2, qtd1, qtd2;
        double valor1, valor2, total;

        System.out.printf("Digite o codigo do primeiro produto: ");
        cod1 = sc.nextInt();
        System.out.printf("Digite a quantidade do primeiro produto: ");
        qtd1 = sc.nextInt();
        System.out.printf("Digite o valor do primeiro produto: R$");
        valor1 = sc.nextDouble();

        System.out.printf("Digite o codigo do segundo produto: ");
        cod2 = sc.nextInt();
        System.out.printf("Digite a quantidade do segundo produto: ");
        qtd2 = sc.nextInt();
        System.out.printf("Digite o valor do segundo produto: R$");
        valor2 = sc.nextDouble();

        total = ((double) qtd1 * valor1) + ((double) qtd2 * valor2);
        System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}