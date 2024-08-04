package model.domain;

import java.util.List;

public class Conteudo {
    private String titulo;
    private String genero;
    private int anolancamento;
    private int duracao;
    private List<Avaliacao> avaliacoes;

    public Conteudo() {

    }

    public Conteudo(String titulo, String genero, int anolancamento, int duracao, List<Avaliacao> avaliacoes) {
        this.titulo = titulo;
        this.genero = genero;
        this.anolancamento = anolancamento;
        this.duracao = duracao;
        this.avaliacoes = avaliacoes;
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

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLancamento='" + anolancamento + '\'' +
                ", duracao='" + duracao + '\'' +
                ", avaliacoes='" + avaliacoes + '\'';
    }
}
