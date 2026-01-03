package br.com.alura.orientacaoobjetos.dominio.exercicios;

public class Livro {

    // Estou apredendo Array Multidimensional
    // Para memoriazar vou trabalhar com os dois for (for , foreach)
    // A primeira camada do Array será i
    // A segunda camada será o j
    // Primeira posição do Array se refere ao Titulo do Livro
    // A segunda posição se refere ao Autor do Livro

    private String[][] tituloAutor;
    private int contagemLivros = 0;
    private int contagemAutores = 0;

    public void setTituloAutor(String[][] tituloAutor) {
        this.tituloAutor = tituloAutor;
    }

    public String[][] getTituloAutor() {
        return tituloAutor;
    }

    public void exibirLivros() {
        System.out.println("----------------------------BIBLIOTECA_VIRTUAL_FRAN--------------------------------------------");
        for (int i = 0; i < tituloAutor.length; i++) {
            System.out.println("============================================================================================");
            System.out.println("Titulo do livro : " + tituloAutor[i][0] + "| Autor: " + tituloAutor[i][1] + ".\n");
            contagemLivros=i+1;


        }
        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.println("Total de livros: " + contagemLivros + ".\n");
        contagemAutores = contagemLivros;
        System.out.println("Total de Autores: " + contagemAutores + ".");

    }

}
// Caso eu quisesse contar com multiplos Autores

//for (int i = 0; i < livros.length; i++) {
        //System.out.println("Livro: " + livros[i][0]); // título sempre na posição 0

    //for (int j = 1; j < livros[i].length; j++) { // começa em 1 porque 0 é título
        //System.out.println("Autor: " + livros[i][j]);
    //}
            //}