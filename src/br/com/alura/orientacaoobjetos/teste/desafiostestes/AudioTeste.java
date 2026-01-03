package br.com.alura.orientacaoobjetos.teste.desafiostestes;

import br.com.alura.orientacaoobjetos.dominio.desafios.Audio;
import br.com.alura.orientacaoobjetos.dominio.desafios.Musica;
import br.com.alura.orientacaoobjetos.dominio.desafios.Podcast;

import java.util.Scanner;

public class AudioTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Audio audio = new Audio();
        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        String resposta1;
        String resposta2;

        do {
            System.out.println("Qual musica vamos cadastrar, digite o nome da musica:");
            String nomeAudio = sc.nextLine();
            System.out.println("Qual é a duração dessa musica em minutos:");
            Double duracaoAudio = sc.nextDouble();
            sc.nextLine(); // Limpar o buffer do Scanner (consumir a quebra de linha)

            System.out.println("Qual é o nome do artista dessa musica? ");
            String nomeArtista = sc.nextLine();

            System.out.println("Qual é o nome do Album dessa musica? ");
            String nomeAlbum = sc.nextLine();

            System.out.println("Qual é o genero musical dessa musica? ");
            String generoMusica = sc.nextLine();
            //sc.nextLine(); // Limpar o buffer do Scanner
            musica.adicionarMusica(nomeArtista, nomeAlbum, generoMusica, nomeAudio, duracaoAudio);
            System.out.println("Quer continuar e cadastrar algum lista de Podcast? S/N");
            resposta1 = sc.nextLine();
            if (resposta1.equalsIgnoreCase("N")) {
                break;
            } else {


                System.out.println("-------------------------------------------------------------");
                System.out.println("Qual o podcast que vamos cadastrar, digite :");
                String nomeApresentador = sc.nextLine();
                System.out.println("Descreve em poucas palavras o assunto do Podcast...");
                String descricaoPodcast = sc.nextLine();
                System.out.println(" Qual é o tema desse Podcast?");
                String nomeAudio2 = sc.nextLine();
                System.out.println("Qual é a duração dessa musica em minutos:");
                Double duracaoAudio2 = sc.nextDouble();
                sc.nextLine(); // Limpar o buffer do Scanner (consumir a quebra de linha)
                podcast.adicionarPodcast(nomeApresentador, descricaoPodcast, nomeAudio2, duracaoAudio2);

                System.out.println("Quer continuar cadastrando musicas? S/N");
                resposta2 = sc.nextLine();
            }
        } while (resposta2.equalsIgnoreCase("S"));


        musica.exibirListaMusicasMaisItens();
        podcast.exibirListaPodcasts();
        sc.close();


        System.out.println(" Os generos musicas existentes são: " + musica.getGeneroMusical());
    }
}