package br.edu.infnet.apptalesauto.model.domain;

public class Concessionaria {

    private long id;

    private String nome;


    private Endereco endereco;


    public Concessionaria(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Concessionaria() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Concessionaria [nome=" + nome + ", endereco=" + endereco + "]";
    }
}
