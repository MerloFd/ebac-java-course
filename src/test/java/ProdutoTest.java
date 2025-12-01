import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void TestCadastrarProduto(){
        Produto produto = new Produto();
        produto.setCodigo("Z1");
        produto.setNome("macbook");
        produto.setValor(11000l);
        produto.setDescricao("macbook");
        produto.setFornecedor("P");
        produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
