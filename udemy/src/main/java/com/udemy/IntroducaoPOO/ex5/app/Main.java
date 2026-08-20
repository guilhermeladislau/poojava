package com.udemy.IntroducaoPOO.ex5.app;
import java.util.Scanner;
import com.udemy.IntroducaoPOO.ex5.entities.Student;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Student a1 = new Student();
            System.out.print("Digite o nome do aluno:");
            a1.name = sc.nextLine();
            System.out.print("Digite a nota do 1 trimestre: ");
            a1.n1 = sc.nextDouble();
            System.out.print("Digite a nota do 2 trimestre: ");
            a1.n2 = sc.nextDouble();
            System.out.print("Digite a nota do 3 trimestre: ");
            a1.n3 = sc.nextDouble();

            System.out.println();

            System.out.printf("Final grade: %.2f%n", a1.notaFinal());
            if (a1.notaFinal() < 60.0){
                System.out.println("FAILED");
                System.out.printf("MISSING %.2f POINTS", a1.notaFaltante());
            } else {
                System.out.println("PASS");
            }
            sc.close();
    }
}
