import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        double area = 3.14 * (Math.pow(raio, 2));

        System.out.printf("O circulo com raio %.2f tem area de %f", raio, area);

        sc.close();
    }
}
