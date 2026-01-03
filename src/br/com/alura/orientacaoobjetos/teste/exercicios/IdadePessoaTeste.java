package br.com.alura.orientacaoobjetos.teste.exercicios;

import br.com.alura.orientacaoobjetos.dominio.exercicios.IdadePessoa;

public class IdadePessoaTeste {
    static void main(String[] args) {
        IdadePessoa registroPessoal1 = new IdadePessoa();
        IdadePessoa registroPessoal2 = new IdadePessoa();

        registroPessoal1.setNome("Francisco");
        registroPessoal1.setIdade(46);
        System.out.println("--------------------------------------");
        registroPessoal2.setNome("Rosana");
        registroPessoal2.setIdade(47);

        System.out.println("---------Membros_Cadastrados--------------------");
        registroPessoal1.exibeRegistroPessoal();
        registroPessoal2.exibeRegistroPessoal();
        System.out.println("---------Comparação de Idades--------------------");
        registroPessoal1.verificarIdade(registroPessoal2);
        registroPessoal2.verificarIdade(registroPessoal1);

    }
}
