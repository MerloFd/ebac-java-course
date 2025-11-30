package br.com.merlo.generics.domain;

public class Volkswagen extends Carro {

    private Boolean tetoSolar;

    private Long cpfCadastrado;

    public Volkswagen(String cpfCadastrado, String modelo, String cor, String potencia, String tetoSolar){
        super(modelo, cor, potencia);
        this.cpfCadastrado = Long.valueOf(cpfCadastrado);
        this.tetoSolar = converterParaBoolean(tetoSolar);
    }

    @Override
    public Long getCodigo() {
        return cpfCadastrado;
    }

    @Override
    public Boolean converterParaBoolean(String input) {
        if ("S".equalsIgnoreCase(input)){
            return true;
        } else if ("N".equalsIgnoreCase(input)) {
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Volksvagen{" +
                "cpfCadastrado=" + cpfCadastrado +
                '}';
    }
}
