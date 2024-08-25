package br.edu.infnet.apptalesauto.model.domain;

import java.time.LocalDate;



public class Venda {

    private long id;


    private LocalDate dataVenda;
    private double valor;


    public Venda(Vendedor vendedor, Veiculo veiculo, LocalDate dataVenda, double valor) {

        this.dataVenda = dataVenda;
        this.valor = valor;
    }

    public Venda() {
    }





    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Venda [dataVenda=" + dataVenda + ", valor=" + valor + "]";
    }
}
