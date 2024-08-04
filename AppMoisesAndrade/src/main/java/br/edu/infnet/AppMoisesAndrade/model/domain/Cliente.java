package br.edu.infnet.AppMoisesAndrade.model.domain;

import java.util.Date;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private Date dataNascimento;
    private Boolean assinante;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String email, Date dataNascimento, Boolean assinante) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.assinante = assinante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Boolean getAssinante() {
        return assinante;
    }

    public void setAssinante(Boolean assinante) {
        this.assinante = assinante;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", assinante=" + (assinante == true ? "'Sim'" : "'Não'") +
                '}';
    }
}