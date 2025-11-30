package br.com.merlo.generics.domain;

public class Honda extends Carro {

    private Boolean freioAutomatico;

    private Long cpfCadastrado;

    public Honda(String cpfCadastrado, String modelo, String cor, String potencia, String freioAutomatico){
        super(modelo, cor, potencia);
        this.cpfCadastrado = Long.valueOf(cpfCadastrado.trim());
        this.freioAutomatico = converterParaBoolean(freioAutomatico);
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
        return "Honda{" +
                "cpfCadastrado=" + cpfCadastrado +
                '}';
    }
}
