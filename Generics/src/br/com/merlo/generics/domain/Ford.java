package br.com.merlo.generics.domain;

public class Ford extends Carro {

    private Boolean blindado;

    private Long cpfCadastrado;

    public Ford(String cpfCadastrado, String modelo, String cor, String potencia, String blindado){
        super(modelo, cor, potencia);
        this.cpfCadastrado = Long.valueOf(cpfCadastrado.trim());
        this.blindado = converterParaBoolean(blindado);
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
        return "Ford{" +
                "cpfCadastrado=" + cpfCadastrado +
                '}';
    }
}
