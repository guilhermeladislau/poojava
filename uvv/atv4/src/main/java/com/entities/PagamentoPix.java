package com.entities;

public class PagamentoPix extends FormaPagamento {
    
    public PagamentoPix(double valor) {
        super(valor);
    }
    
    @Override
    public double calcularTotal() {
        // Desconto de 10%
        return valor * 0.9;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("====== PAGAMENTO PIX ======");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Desconto (10%%): R$ %.2f%n", valor - calcularTotal());
        System.out.printf("Valor total a pagar: R$ %.2f%n", calcularTotal());
        System.out.println("Pix processado com sucesso!");
        System.out.println("===========================");
    }
}
