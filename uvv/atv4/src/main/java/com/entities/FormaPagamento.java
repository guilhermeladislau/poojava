package com.entities;

public abstract class FormaPagamento {
    
    protected double valor;
    
    public FormaPagamento(double valor) {
        this.valor = valor;
    }
    
    // Método abstrato para calcular o total com taxas ou descontos
    public abstract double calcularTotal();
    
    // Método para processar o pagamento
    public abstract void processarPagamento();
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
}
