package br.com.merlo.CadUsingReflexions.dao;

import br.com.merlo.CadUsingReflexions.dao.generic.GenericDAO;
import br.com.merlo.CadUsingReflexions.domain.Produto;
import java.util.HashMap;
import java.util.Map;
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{

    public ProdutoDAO(){
        super();
        this.map = new HashMap<>();
        Map<Long, Produto> mapaInterno = this.map.get(getClassType()); //instancia o mapa interno (mapa das implementacoes
        if (mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getClassType(), mapaInterno);
        }
    }
    @Override
    public Class<Produto> getClassType() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto produto, Produto entityCadastrada) {
        entityCadastrada.setNome(produto.getNome());
        entityCadastrada.setCodigo(produto.getCodigo());
    }
}
