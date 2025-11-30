package br.com.merlo.appexemplo.service;

import br.com.merlo.appexemplo.dao.ClienteDAO;
import br.com.merlo.appexemplo.dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO=clienteDAO;
    }

    public String salvar(){
        clienteDAO.salvar();
        return "sucesso";
    }
}
