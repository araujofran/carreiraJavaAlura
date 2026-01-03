package br.com.alura.orientacaoobjetos.dominio.exercicios;

import br.com.alura.orientacaoobjetos.teste.exercicios.IdadePessoaTeste;

import java.sql.SQLOutput;

public class IdadePessoa {
    private String nome;
    private int idade;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibeRegistroPessoal() {
        System.out.println(this.nome + " tem " + this.idade + " anos.\n");
        System.out.println("*******************************************");
    }

    public void verificarIdade(IdadePessoa outraPessoa) {
        if (this.idade > outraPessoa.getIdade()) {
            System.out.println(this.nome + " é mais velho(a) que " + outraPessoa.getNome());
        } else if (this.idade < outraPessoa.getIdade()) {
            System.out.println(this.nome + " é mais novo(a) que " + outraPessoa.getNome());
        } else {
            System.out.println(this.nome + " e " + outraPessoa.getNome() + " têm a mesma idade");
        }

    }

}
