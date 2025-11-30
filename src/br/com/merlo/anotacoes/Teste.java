package br.com.merlo.anotacoes;

@PrimeiraAnotacao(value = "matheus", bairros = {"a","b","c"}, numeroCasa = 9, valore = 11d)
public class Teste{

    @PrimeiraAnotacao(value = "merlo", bairros = {"a","b","c"}, numeroCasa = 7)
    private String teste;

    @PrimeiraAnotacao(value = "construtor", bairros = "bairro X", numeroCasa = 777, valore = 8d)
    public Teste (){

    }
}
