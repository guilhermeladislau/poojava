package com.uvv.aula19082026.entities;

public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(int agencia, int numero, double saldo, double limite){
        super(agencia, numero, saldo);
        this.limite = limite;
    }

    public void atualizarLimite(double limite){
        if(limite>=0){
            double diferenca = limite - this.limite;

            if (diferenca > 0){
                creditar(diferenca);
            }else if (diferenca < 0){
                debitar(diferenca);
            }
            this.limite = limite;
            }
        }
    

    @Override
    public String toString(){
        return super.toString() + "limite = " + limite;
    }
}