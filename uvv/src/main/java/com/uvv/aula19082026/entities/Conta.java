package com.uvv.aula19082026.entities;

public class Conta {
    private int agencia, numero;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }
    
    public Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void creditar(double valor){
        if(valor > 0){
            this.saldo += valor;
            //System.out.println("Crédito Realizado!");
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    public void debitar(double valor){
        if(valor > 0 && valor <= getSaldo()){
            this.saldo -= valor;    
            // System.out.println("Débito Realizado!");
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }
    
    public void transferir(double valor, Conta destino){
        if(valor > 0 && destino != null && valor <=  getSaldo()){
            this.debitar(valor);
            destino.creditar(valor);
            //System.out.println("Transferência Realizada!");
        }else{
            System.out.println("Transferência Negada!");
                    
                    
        }
    
    }
    
    
    @Override
    public String toString(){
        return "Conta: \nNúmero da Agência: "+ getAgencia() + "\n"
                 +"Número da Conta: "+ getNumero() + "\n" +
                "Saldo: R$ " + getSaldo();
    }
}
