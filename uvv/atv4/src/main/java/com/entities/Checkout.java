package com.entities;

public class Checkout {
    
    // Método que utiliza polimorfismo para processar qualquer forma de pagamento
    public void finalizarCompra(FormaPagamento pagamento) {
        if (pagamento != null) {
            pagamento.processarPagamento();
        } else {
            System.out.println("Erro: Forma de pagamento inválida!");
        }
    }
}
