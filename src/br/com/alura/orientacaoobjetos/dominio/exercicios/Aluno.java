package br.com.alura.orientacaoobjetos.dominio.exercicios;

public class Aluno {
    private String nomeDoAluno;
    private Double[] notasAluno;


    //Objetivo principal é calcular a média das notas do Aluno
    // Estou aprendendo sobre Arrays, como manusear
    // Como esse sistema é hipotetico o professor poderá mudar as notas do aluno


    public void exibirStatusDoAluno() {
        System.out.print("Aluno: " + this.nomeDoAluno + " recebeu as seguintes notas: ");
        for (Double notaAluno : notasAluno) {
            System.out.print(notaAluno + " ");
        }
        System.out.print(".");
    }
    Double mediaNota;
    public void imprimeMediaNotas(){
        Double somaNotas = 0.0;



        for (double notaAluno: notasAluno){
            somaNotas +=notaAluno;


        }
        mediaNota = (somaNotas / notasAluno.length);
        System.out.println("\nA soma das notas é : " + somaNotas);
        System.out.println("\nA media das notas é : " + mediaNota);

    }

    public Double[] getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(Double[] notasAluno) {
        this.notasAluno = notasAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }
}
