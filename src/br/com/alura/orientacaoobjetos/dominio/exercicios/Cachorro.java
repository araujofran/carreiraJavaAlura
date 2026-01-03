package br.com.alura.orientacaoobjetos.dominio.exercicios;

public class Cachorro extends Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Au au au!");
    }

    public void buscarOsso() {
        System.out.println("Buscando o osso!");
    }



}