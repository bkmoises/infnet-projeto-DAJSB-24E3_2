package br.edu.infnet.AppMoisesAndrade.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Conteudo {
    private List<String> oscar;

    public Filme() {
        oscar = new ArrayList<String>();
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
