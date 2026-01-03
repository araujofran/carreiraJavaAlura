package br.com.alura.orientacaoobjetos.dominio.exercicios;

public class Produto {

    private String nome;
    private Double preco;
    private double novoPreco = 0;
    private double desconto = 0;
    private double percentual = 0;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    //método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

    //O consumidor ao aplicar o preco ao  produto vai receber um desconto
    // Se o valor for maior que 100,00 recebe um desconto de 10%.
    // Se for menor que 100,00 recebe um desconto de 5%.

    public void aplicarDesconto(Produto valorInserido) {

        if (this.preco >= 100.00) {

            novoPreco = this.preco * 0.90;
            desconto = this.preco - novoPreco;
            percentual = 100-((novoPreco / this.preco)*100);

        } else if (this.preco < 100.00) {

            novoPreco = this.preco * 0.95;
            desconto = this.preco - novoPreco;
            percentual = 100-((novoPreco / this.preco)*100);

        }

        System.out.printf("No %s, o cliente inseriu o valor de R$%.2f e recebeu um desconto de R$%.2f,  o que corresponde a %.0f%% do valor total.%n", this.nome, this.preco, desconto, percentual );
        System.out.println("=================================================================================================================================================");
    }
    public void comparaDescontos (Produto comparaD){
        if(this.percentual<comparaD.percentual){

            System.out.printf(" O %s , com %.0f%% de desconto , recebeu menos desconto do que %s , que teve %.0f%% de desconto do valor total.%n" ,this.nome ,this.percentual,  comparaD.nome , comparaD.percentual);
        } else if (this.percentual> comparaD.percentual) {

            System.out.printf(" O %s , com %.0f%% de desconto, recebeu mais desconto do que %s ,  que teve %.0f%% de desconto do valor total.%n" ,this.nome ,this.percentual,  comparaD.nome , comparaD.percentual);

        }else if (this.percentual == comparaD.percentual){

            System.out.printf(" O livro %s  recebeu o mesmo desconto do que %s." ,this.nome , comparaD.nome);
        }
    }
}
