package br.com.merlo.appexemplo.service;

import br.com.merlo.appexemplo.dao.IContratoDAO;

public class ContratoService implements IContratoService{

    private IContratoDAO iContratoDAO;

    public ContratoService(IContratoDAO iContratoDAO){
        this.iContratoDAO=iContratoDAO;
    }
    @Override
    public String salvar() {
        iContratoDAO.salvar();
        return "salvo com sucesso";
    }

    @Override
    public String buscar() {
        iContratoDAO.buscar();
        return "sucesso na busca";
    }

    @Override
    public String excluir() {
        iContratoDAO.excluir();
        return "excluido com sucesso";
    }

    @Override
    public String alterar() {
        iContratoDAO.alterar();
        return "alterado com sucesso";
    }


}
