package br.com.alura.orientacaoobjetos.teste.exercicios;

import br.com.alura.orientacaoobjetos.dominio.exercicios.Aluno;

public class AlunoTeste {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNomeDoAluno("Francisco");
        aluno1.setNotasAluno(new Double[]{10.0,15.0,50.0,10.0});

        aluno1.exibirStatusDoAluno();
        aluno1.imprimeMediaNotas();
    }


}
