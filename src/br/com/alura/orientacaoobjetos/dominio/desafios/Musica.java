package br.com.alura.orientacaoobjetos.dominio.desafios;

import java.util.ArrayList;
import java.util.List;

public class Musica extends Audio {

    private List<String> nomeDoArtista;
    private List<String> nomeDoAlbum;
    private List<String> generoMusical;

    public Musica() {
        this.nomeDoArtista = new ArrayList<>();
        this.nomeDoAlbum = new ArrayList<>();
        this.generoMusical = new ArrayList<>();
        this.nomesAudio = new ArrayList<>();
        this.duracoesAudio = new ArrayList<>();
    }

    public void adicionarMusica(String nomeArtista, String nomeAlbum,String generoMusica,String nomeAudio, Double duracaoAudio ) {
        this.nomeDoArtista.add(nomeArtista);
        this.nomeDoAlbum.add(nomeAlbum);
        this.generoMusical.add(generoMusica);
        this.nomesAudio.add(nomeAudio);
        this.duracoesAudio.add(duracaoAudio);
    }

    public List<String> getNomeDoArtista() {
        return nomeDoArtista;
    }

    public List<String> getGeneroMusical() {
        return generoMusical;
    }

    public List<String> getNomeDoAlbum() {
        return nomeDoAlbum;
    }

    public void exibirListaMusicasMaisItens() {
        System.out.println("Menu das musicas existentes na memoria:");

        for (int i = 0; i < nomesAudio.size(); i++) {
            System.out.print((i + 1) + ".Musica: " + nomesAudio.get(i) + " | Duração da musica:  " + duracoesAudio.get(i) + " minutos |" + " Cantor(a):  " + nomeDoArtista.get(i) + " | Genero musical:  " + generoMusical.get(i) + " | Nome do Album:  " + nomeDoAlbum.get(i) +  ".\n");

        }
    }
}
