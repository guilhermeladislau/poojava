package exercicios;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), total = 0;

        while (num != 0){
            total += num;
            num = sc.nextInt();
        }
        System.out.println(total);
        sc.close();
    }
}
