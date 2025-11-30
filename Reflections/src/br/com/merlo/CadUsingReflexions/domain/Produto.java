package br.com.merlo.CadUsingReflexions.domain;

import br.com.merlo.CadUsingReflexions.annotation.TipoChave;

public class Produto implements Persistente{

    @TipoChave("getCodigo")
    private Long codigo;
    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
