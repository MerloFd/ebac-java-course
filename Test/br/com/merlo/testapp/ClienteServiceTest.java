package br.com.merlo.testapp;

import br.com.merlo.appexemplo.dao.ClienteDAO;
import br.com.merlo.appexemplo.mock.ClienteDAOMock;
import br.com.merlo.appexemplo.dao.IClienteDAO;
import br.com.merlo.appexemplo.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
    @Test
    public void salvarTest(){
        IClienteDAO mockService = new ClienteDAOMock();

        ClienteService service = new ClienteService(mockService);
        String retorno = service.salvar();

        Assert.assertEquals("sucesso",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void salvarComErroEsperadoTest(){
        IClienteDAO dao = new ClienteDAO();

        ClienteService service = new ClienteService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("sucesso",retorno);
    }
}
