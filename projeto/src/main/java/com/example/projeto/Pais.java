package com.example.projeto;

public class Pais implements Pessoa{

    private int registro;
    private String nome;
    private String continente;

    public Pais(int registro, String nome, String continente) {
        this.registro = registro;
        this.nome = nome;
        this.continente = continente;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getContinente() {
        return continente;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPais(this);
    }
}
