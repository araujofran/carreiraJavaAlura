package br.com.alura.orientacaoobjetos.teste.exercicios;

import br.com.alura.orientacaoobjetos.dominio.exercicios.ContaBancaria;

public class ContaBancariaTeste {

    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setNomeCliente("Francisco");
        System.out.println("Cliente: " + contaBancaria.getNomeCliente());
        System.out.println("Conta: " + contaBancaria.getNumeroConta());
        System.out.printf("Saldo: R$%.0f%n" ,contaBancaria.getSaldo());


        contaBancaria.exibirDadosConta();
    }

}
