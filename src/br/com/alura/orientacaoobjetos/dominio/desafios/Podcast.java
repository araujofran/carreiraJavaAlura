package br.com.alura.orientacaoobjetos.dominio.desafios;

import java.util.ArrayList;
import java.util.List;

public class Podcast extends Audio {

    private List<String> nomeDoApresentador;
    private List<String> descricaoDoPodcast;

    public Podcast() {
        this.nomeDoApresentador = new ArrayList<>();
        this.descricaoDoPodcast = new ArrayList<>();

        this.nomesAudio = new ArrayList<>();
        this.duracoesAudio = new ArrayList<>();
    }

    public void adicionarPodcast(String nomeApresentador, String descricaoPodcast,String nomeAudio2, Double duracaoAudio2 ) {
        this.nomeDoApresentador.add(nomeApresentador);
        this.descricaoDoPodcast.add(descricaoPodcast);

        this.nomesAudio.add(nomeAudio2);
        this.duracoesAudio.add(duracaoAudio2);
    }

    public void exibirListaPodcasts() {
        System.out.println("Menu dos podcasts existentes na memoria:");
        for (int i = 0; i < nomesAudio.size(); i++) {
            System.out.println((i + 1) + ".Podcast: " + nomesAudio.get(i) + " | Duração: " + duracoesAudio.get(i) + " minutos | Apresentador: " + nomeDoApresentador.get(i) + " | Descrição: " + descricaoDoPodcast.get(i));
        }
    }

}
