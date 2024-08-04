package model.domain;

import java.util.List;

public class Filme extends Conteudo {
    private List<String> oscar;

    public Filme() {

    }

    public Filme(String titulo, String genero, int anolancamento, int duracao, List<Avaliacao> avaliacoes, List<String> oscar) {
        super(titulo, genero, anolancamento, duracao, avaliacoes);
        this.oscar = oscar;
    }

    public List<String> getOscar() {
        return oscar;
    }

    public void setOscar(List<String> oscar) {
        this.oscar = oscar;
    }

    @Override
    public String toString() {
        return "Filme{" + super.toString() + '\'' +
                ", oscar='" + oscar + '\'' +
                '}';
    }
}
