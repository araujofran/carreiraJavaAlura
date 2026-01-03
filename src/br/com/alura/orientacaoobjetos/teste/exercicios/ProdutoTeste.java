package br.com.alura.orientacaoobjetos.teste.exercicios;

import br.com.alura.orientacaoobjetos.dominio.exercicios.Produto;

public class ProdutoTeste {
    static void main(String[] args) {
        Produto listaProdutos =new Produto();
        Produto listaProdutos2 =new Produto();

        listaProdutos.setNome("Livro Java Efetivo");
        listaProdutos.setPreco(150.00);
        System.out.println(" ");
        listaProdutos2.setNome("Livro Use a Cabeça- Java");
        listaProdutos2.setPreco(75.00);
        System.out.println(" ");
        listaProdutos.aplicarDesconto(listaProdutos);
        listaProdutos2.aplicarDesconto(listaProdutos);
        System.out.println("Compara descontos ");
        listaProdutos.comparaDescontos(listaProdutos2);
        listaProdutos2.comparaDescontos(listaProdutos);
    }
}
