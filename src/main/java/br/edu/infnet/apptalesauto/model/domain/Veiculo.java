package br.edu.infnet.apptalesauto.model.domain;

public abstract class Veiculo {

    private long id;

    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    private Venda venda;

    private Concessionaria concessionaria;

    public Veiculo(String marca, String modelo, int ano, double preco, Concessionaria concessionaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.concessionaria = concessionaria;
    }

    public Veiculo() {
    }

    public Veiculo(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Veiculo [ Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + ano + ", Preco=" + preco;
    }
}
