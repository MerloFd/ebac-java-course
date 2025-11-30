package br.com.merlo.CadUsingReflexions.dao;

import br.com.merlo.CadUsingReflexions.dao.generic.IGenericDAO;
import br.com.merlo.CadUsingReflexions.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO extends IGenericDAO<Cliente> {
    public Boolean cadastrar (Cliente cliente);
    public void excluir(Long cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar (Long cpf);
    public Collection<Cliente> buscarTodos ();
}
