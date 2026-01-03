package br.com.alura.orientacaoobjetos.dominio.desafios;

import java.util.ArrayList;
import java.util.List;

public class Audio {
    List<String> nomesAudio;
    List<Double> duracoesAudio;

    public Audio() {
        this.nomesAudio = new ArrayList<>();
        this.duracoesAudio = new ArrayList<>();
    }

    public void adicionarAudio(String nomeAudio, Double duracaoAudio) {
        this.nomesAudio.add(nomeAudio);
        this.duracoesAudio.add(duracaoAudio);
    }

    public List<String> getNomesAudio() {
        return nomesAudio;
    }

    public List<Double> getDuracoesAudio() {
        return duracoesAudio;
    }


   }
