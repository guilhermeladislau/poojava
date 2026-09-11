package com.entities;

public class PagamentoBoleto extends FormaPagamento {
    
    public PagamentoBoleto(double valor) {
        super(valor);
    }
    
    @Override
    public double calcularTotal() {
        // Taxa fixa de R$ 2,00
        return valor + 2.0;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("===== PAGAMENTO BOLETO =====");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa fixa: R$ 2.00%n");
        System.out.printf("Valor total a pagar: R$ %.2f%n", calcularTotal());
        System.out.println("Boleto processado com sucesso!");
        System.out.println("=============================");
    }
}
