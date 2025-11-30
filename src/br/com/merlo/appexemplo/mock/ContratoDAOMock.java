package br.com.merlo.appexemplo.mock;

import br.com.merlo.appexemplo.dao.IContratoDAO;

public class ContratoDAOMock implements IContratoDAO {
    @Override
    public String salvar() {
        return "objeto MOCK";
    }

    @Override
    public String buscar() {
        return "objeto MOCK";
    }

    @Override
    public String excluir() {
        return "objeto MOCK";
    }

    @Override
    public String alterar() {
        return "objeto MOCK";
    }
}
