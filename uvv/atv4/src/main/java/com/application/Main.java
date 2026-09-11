package com.uvv.atv4.application;


import com.entities.*;

public class Main {
    
    public static void main(String[] args) {
        
        Checkout checkout = new Checkout();
    
        System.out.println("\n[TESTE 1: PIX]");
        FormaPagamento pix = new PagamentoPix(100.0);
        checkout.finalizarCompra(pix);
        
        System.out.println("\n[TESTE 2: CARTÃO]");
        FormaPagamento cartao = new PagamentoCartao(100.0);
        checkout.finalizarCompra(cartao);
        
        System.out.println("\n[TESTE 3: BOLETO]");
        FormaPagamento boleto = new PagamentoBoleto(100.0);
        checkout.finalizarCompra(boleto);
        
        System.out.println("\n[TESTE 4: COMPARAÇÃO COM VALORES DIFERENTES]");
        double valor = 250.50;
        
        FormaPagamento pixAlt = new PagamentoPix(valor);
        checkout.finalizarCompra(pixAlt);
        
        FormaPagamento cartaoAlt = new PagamentoCartao(valor);
        checkout.finalizarCompra(cartaoAlt);
        
        FormaPagamento boletoAlt = new PagamentoBoleto(valor);
        checkout.finalizarCompra(boletoAlt);
    }
} 