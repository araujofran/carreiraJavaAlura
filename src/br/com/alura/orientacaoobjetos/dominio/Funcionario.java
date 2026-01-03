package br.com.alura.orientacaoobjetos.dominio;

import br.com.alura.orientacaoobjetos.teste.FuncionarioTeste;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDadosFuncionario() {


        //System.out.printf("O funcionario %s tem idade de %d anos e recebe o salário de R$ %.2f.%n",
        //this.nome,
        //this.idade,
        //this.salario);

        System.out.print("O funcionario " + this.nome + " tem a idade de " + this.idade + " anos.\n");
        for (double salario : salarios) {
            System.out.printf("%nEle recebe um salario R$%.2f.%n", salario);
            System.out.println("---------------------------------------------------------------------------------------");
        }


    }

    public void imprimeMediaSalario() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;

        }
        media /= salarios.length;
        System.out.println("___________________________________________________________________________________________");
        System.out.printf("%nMédia Salarial do funcionario %s é de: R$%.0f.%n", this.nome, media);
    }

}
