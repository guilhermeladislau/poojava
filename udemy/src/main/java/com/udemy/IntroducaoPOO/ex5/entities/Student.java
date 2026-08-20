package com.udemy.IntroducaoPOO.ex5.entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double notaFinal(){
        return n1 + n2 + n3;
    }

    public double notaFaltante(){
        if (notaFinal() < 60.0){
            return 60.0 - notaFinal();
        } else{
            return 0.0;
        }
    }
}
