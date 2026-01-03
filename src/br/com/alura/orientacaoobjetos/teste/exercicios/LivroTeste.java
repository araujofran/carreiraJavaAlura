package br.com.alura.orientacaoobjetos.teste.exercicios;

import br.com.alura.orientacaoobjetos.dominio.exercicios.Livro;

public class LivroTeste {
    static void main(String[] args) {
        Livro cadastrosLivros = new Livro();

        cadastrosLivros.setTituloAutor(new String[][]{
                {"Harry Potter", "J.K. Rowling"},
                {"O Hobbit", "J.R.R. Tolkien"},
                {"Dom Casmurro", "Machado de Assis"},
                {"Grande Sertão: Veredas", "João Guimarães Rosa"},
                {"Memórias Póstumas de Brás Cubas", "Machado de Assis"},
                {"Capitães da Areia", "Jorge Amado"},
                {"A Hora da Estrela", "Clarice Lispector"},
                {"O Alquimista", "Paulo Coelho"},
                {"1984", "George Orwell"},
                {"A Revolução dos Bichos", "George Orwell"},
                {"Cem Anos de Solidão", "Gabriel García Márquez"},
                {"O Pequeno Príncipe", "Antoine de Saint-Exupéry"},
                {"Orgulho e Preconceito", "Jane Austen"},
                {"Crime e Castigo", "Fiódor Dostoiévski"},
                {"Guerra e Paz", "Liev Tolstói"},
                {"O Conde de Monte Cristo", "Alexandre Dumas"},
                {"Os Miseráveis", "Victor Hugo"},
                {"Drácula", "Bram Stoker"},
                {"Frankenstein", "Mary Shelley"},
                {"O Nome da Rosa", "Umberto Eco"}

        });

        cadastrosLivros.exibirLivros();
    }
}
