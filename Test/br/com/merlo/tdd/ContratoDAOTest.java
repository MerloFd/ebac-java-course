package br.com.merlo.tdd;

import br.com.merlo.appexemplo.dao.ContratoDAO;
import br.com.merlo.appexemplo.mock.ContratoDAOMock;
import br.com.merlo.appexemplo.dao.IContratoDAO;
import br.com.merlo.appexemplo.service.ContratoService;
import br.com.merlo.appexemplo.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoDAOTest {

    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoNoSalvarBancoTest(){
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);

        String retorno = dao.salvar();
        Assert.assertEquals("salvo com sucesso",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoNoBuscarBancoTest(){
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);

        String retorno = dao.buscar();
        Assert.assertEquals("salvo com sucesso",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoNoExcluirBancoTest(){
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);

        String retorno = dao.excluir();
        Assert.assertEquals("salvo com sucesso",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoNoAlterarBancoTest(){
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);

        String retorno = dao.alterar();
        Assert.assertEquals("salvo com sucesso",retorno);
    }
}
