package br.com.alura.orientacaoobjetos.teste.exercicios;

import br.com.alura.orientacaoobjetos.dominio.exercicios.Animal;
import br.com.alura.orientacaoobjetos.dominio.exercicios.Cachorro;
import br.com.alura.orientacaoobjetos.dominio.exercicios.Gato;

public class AnimalTeste {
    static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.fazerBarulho();
        cachorro.buscarOsso();

        System.out.println("-----------");

        Gato gato =new Gato();
        gato.brincarComLaser();
        gato.fazerBarulho();

        System.out.println("-----------Teste_C-------------");

        Animal animal =new Animal();
        animal.fazerBarulho();


    }
}
