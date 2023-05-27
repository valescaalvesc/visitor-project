package com.example.projeto;

public class Requisitante implements Pessoa{

    private int passaporte;
    private String nome;
    private Embaixada embaixada;

    public Requisitante(int passaporte, String nome, Embaixada embaixada) {
        this.passaporte = passaporte;
        this.nome = nome;
        this.embaixada = embaixada;
    }

    public int getPassaporte() {
        return passaporte;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeEmbaixada() {
        return this.embaixada.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirRequisitante(this);
    }
}
