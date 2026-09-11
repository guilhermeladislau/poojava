package com.entities;

public class PagamentoCartao extends FormaPagamento {
    
    public PagamentoCartao(double valor) {
        super(valor);
    }
    
    @Override
    public double calcularTotal() {
        // Taxa de 5%
        return valor * 1.05;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("===== PAGAMENTO CARTÃO =====");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa (5%%): R$ %.2f%n", calcularTotal() - valor);
        System.out.printf("Valor total a pagar: R$ %.2f%n", calcularTotal());
        System.out.println("Cartão processado com sucesso!");
        System.out.println("=============================");
    }
}
