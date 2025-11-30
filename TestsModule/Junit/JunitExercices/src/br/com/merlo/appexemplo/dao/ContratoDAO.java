package br.com.merlo.appexemplo.dao;

public class ContratoDAO implements IContratoDAO{
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("erro no banco ao salvar contrato");
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("erro no banco ao buscar contrato");
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("erro no banco ao excluir contrato");
    }

    @Override
    public String alterar() {
        throw new UnsupportedOperationException("erro no banco ao alterar contrato");
    }
}
