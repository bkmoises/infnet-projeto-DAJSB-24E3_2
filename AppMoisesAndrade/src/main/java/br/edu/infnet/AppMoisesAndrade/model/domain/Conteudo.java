package br.edu.infnet.AppMoisesAndrade.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Conteudo {
    private Integer id;
    private String titulo;
    private String genero;
    private int anolancamento;
    private int duracao;
    private List<Avaliacao> avaliacoes;

    public Conteudo() {
        avaliacoes = new ArrayList<Avaliacao>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLancamento='" + anolancamento + '\'' +
                ", duracao='" + duracao + '\'' +
                ", avaliacoes='" + avaliacoes + '\'';
    }
}
