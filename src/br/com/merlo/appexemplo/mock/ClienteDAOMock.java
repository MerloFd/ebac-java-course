package br.com.merlo.appexemplo.mock;

import br.com.merlo.appexemplo.dao.IClienteDAO;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public String salvar() {
        return "Objeto Mock";
    }
}
