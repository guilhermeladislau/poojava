package com.cev.aula05;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void ContaBanco() {
        saldo = 0;
        status = false;
    }

    public void setNumConta(int n) {
        numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        dono = d;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(double s) {
        saldo = s;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setStatus(boolean st) {
        status = st;
    }

    public boolean getStatus() {
        return status;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            setSaldo(50);
        } else if (t == "CP") {
            setSaldo(150);
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em debito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(double v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Conta fechada. Impossivel depositar.");
        }
    }

    public void sacar(double v) {
        if (getStatus() && getSaldo() > v) {
            setSaldo(getSaldo() - v);
        }
    }

    public void pagarMensal() {
        double var = 0;
        
        if(getTipo() == "CC"){
            var = 12;
        }
        else if (getTipo() == "CP"){
            var = 20;
        }

        if(getStatus() && getSaldo() > var){
            setSaldo(getSaldo() - var);
        } else {System.out.println("impossivel pagar.");}
    }

}
