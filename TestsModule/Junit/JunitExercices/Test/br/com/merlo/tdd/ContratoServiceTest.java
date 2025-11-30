package br.com.merlo.tdd;

import br.com.merlo.appexemplo.dao.ContratoDAO;
import br.com.merlo.appexemplo.mock.ContratoDAOMock;
import br.com.merlo.appexemplo.dao.IContratoDAO;
import br.com.merlo.appexemplo.service.ContratoService;
import br.com.merlo.appexemplo.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.salvar();
        Assert.assertEquals("salvo com sucesso",retorno);
    }


    @Test
    public void buscarTest(){
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.buscar();
        Assert.assertEquals("sucesso na busca",retorno);
    }

    @Test
    public void excluirTest(){
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.excluir();
        Assert.assertEquals("excluido com sucesso",retorno);
    }

    @Test
    public void alterarTest(){
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.alterar();
        Assert.assertEquals("alterado com sucesso",retorno);
    }
}
