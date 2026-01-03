package br.com.alura.orientacaoobjetos.teste.exercicios;

import br.com.alura.orientacaoobjetos.dominio.exercicios.Carro;
import br.com.alura.orientacaoobjetos.dominio.exercicios.ModeloCarro;


// Classe de Teste
public class TesteCarro extends Carro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();



    }
}
