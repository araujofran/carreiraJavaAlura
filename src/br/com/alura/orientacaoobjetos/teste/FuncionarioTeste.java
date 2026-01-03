package br.com.alura.orientacaoobjetos.teste;

import br.com.alura.orientacaoobjetos.dominio.Funcionario;

public class FuncionarioTeste {
    static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();


        funcionario01.nome = "Francisco";
        funcionario01.idade = 46;
        funcionario01.salarios = new double[]{2500.00, 3590, 1000};
        funcionario02.nome = "Fabio";
        funcionario02.idade = 45;
        funcionario02.salarios = new double[]{1500.00, 2590, 1000};


        funcionario01.imprimirDadosFuncionario();
        funcionario02.imprimirDadosFuncionario();
        funcionario01.imprimeMediaSalario();
        funcionario02.imprimeMediaSalario();


    }
}
