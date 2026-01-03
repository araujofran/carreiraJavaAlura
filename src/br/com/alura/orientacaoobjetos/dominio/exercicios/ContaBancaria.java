package br.com.alura.orientacaoobjetos.dominio.exercicios;

public class ContaBancaria {

    private int numeroConta= 1234569;
    private double saldo= 8500;
    public String nomeCliente;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirDadosConta (){
        System.out.printf("O cliente %s tem o saldo de R$%.0f pertencente a conta %d.", this.nomeCliente , this.saldo , this.numeroConta);
    }
}


