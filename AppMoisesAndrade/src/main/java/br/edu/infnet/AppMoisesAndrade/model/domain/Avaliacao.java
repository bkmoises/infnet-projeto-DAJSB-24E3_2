package br.edu.infnet.AppMoisesAndrade.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "TAvaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float  nota;
    private String comentario;

    @Transient
    private Cliente cliente;

    public Avaliacao() {

    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id='" + id + '\'' +
                ", nota='" + nota + '\'' +
                ", comentario='" + comentario + '\'' +
                ", cliente='" + cliente + '\'' +
                "}";
    }
}
