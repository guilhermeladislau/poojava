package exercicios;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.printf("na string voce digitou: %s%n", x);
        System.out.printf("no int voce digitou: %d%n", y);
        System.out.printf("no double voce digitou: %f%n", z);

        sc.close();
    }
}
