package br.com.alura.orientacaoobjetos.teste;

import br.com.alura.orientacaoobjetos.dominio.Funcionario;

public class Funcionario01 {
    static void main(String[] args) {
        Funcionario funcionario01 =new Funcionario();
        Funcionario funcionario02 =new Funcionario();

        funcionario01.nome ="Francisco";
        funcionario01.idade = 46;
        funcionario01.salario= 4800;
        System.out.println(" ");
        funcionario02.nome ="Fabio";
        funcionario02.idade = 45;
        funcionario02.salario= 10000;

        funcionario01.imprimirDadosFuncionario();
        funcionario02.imprimirDadosFuncionario();



    }
}
