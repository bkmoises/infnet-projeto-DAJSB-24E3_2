package model.domain;

public class Avaliacao {
    private float  nota;
    private String comentario;
    private Cliente cliente;

    public Avaliacao() {

    }

    public Avaliacao(float nota, String comentario, Cliente cliente) {
        this.nota = nota;
        this.comentario = comentario;
        this.cliente = cliente;
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

    @Override
    public String toString() {
        return "Avaliacao{" +
                "nota='" + nota + '\'' +
                ", comentario='" + comentario + '\'' +
                ", cliente='" + cliente.toString() + '\'' +
                "}";
    }
}
