package br.edu.infnet.apptalesauto.model.domain;

import java.util.List;


public class Vendedor {


    private long id;

    private String nome;

    private int idade;

    private double salario;


    private List<Venda> vendas;

    private Concessionaria concessionaria;


    public Vendedor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Vendedor(String nome, int idade, double salario, Concessionaria concessionaria) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.concessionaria = concessionaria;
    }

    public Vendedor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    @Override
    public String toString() {
        return "Vendedor [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
    }
}
