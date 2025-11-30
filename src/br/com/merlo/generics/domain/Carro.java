package br.com.merlo.generics.domain;

public abstract class Carro {

    private String modelo;
    private String cor;
    private String potencia;

    public Carro(String modelo, String cor, String potencia){
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public abstract Long getCodigo();

    public abstract Boolean converterParaBoolean(String input);

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia='" + potencia + '\'' +
                '}';
    }
}
