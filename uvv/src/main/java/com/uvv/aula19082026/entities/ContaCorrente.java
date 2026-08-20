package com.uvv.aula19082026.entities;

public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(int agencia, int numero, double saldo, double limite){
        super.setAgencia(agencia);
        //super(agencia,numero,saldo);
        this.limite = limite;
    }
}