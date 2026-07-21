import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, res;

        System.out.printf("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.printf("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.printf("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.printf("Digite o valor de D: ");
        D = sc.nextInt();

        res = (A * B) - (C * D);
        System.out.printf("A diferenca eh de :%d", res);
        sc.close();
    }
}
