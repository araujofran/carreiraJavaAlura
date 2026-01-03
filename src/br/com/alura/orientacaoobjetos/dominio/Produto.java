package br.com.alura.orientacaoobjetos.dominio;

public class Produto {
    String nome;
    double preco;
    double descontoParaPix;

    // O método agora garante um retorno em qualquer cenário
    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix) {
            // Se for true, calcula com desconto e já encerra o método retornando o valor
            return preco - descontoParaPix;
        }

        // Se a condição acima for false, o código continua para cá.
        // Não precisamos nem de 'else' aqui, pois o return acima já desviaria o fluxo.
        return preco;
    }
}

