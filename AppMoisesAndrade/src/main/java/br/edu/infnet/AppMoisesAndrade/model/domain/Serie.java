package br.edu.infnet.AppMoisesAndrade.model.domain;

import java.util.List;

public class Serie extends Conteudo {
    private int temporada;
    private int episodio;

    public Serie() {

    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    @Override
    public String toString() {
        return "Serie{" + super.toString() +
                ", temporada='" + temporada + '\''+
                ", episodio='" + episodio + '\'' +
                '}';
    }
}
