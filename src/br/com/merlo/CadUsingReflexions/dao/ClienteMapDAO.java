package br.com.merlo.CadUsingReflexions.dao;

import br.com.merlo.CadUsingReflexions.dao.generic.GenericDAO;
import br.com.merlo.CadUsingReflexions.domain.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO <Cliente> implements IClienteDAO {

    public ClienteMapDAO(){
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getClassType()); //instancia o mapa interno (mapa das implementacoes
        if (mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getClassType(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente entityCadastrada) {
            entityCadastrada.setNome(cliente.getNome());
            entityCadastrada.setCpf(cliente.getCpf());
            entityCadastrada.setTel(cliente.getTel());
            entityCadastrada.setEnd(cliente.getEnd());
            entityCadastrada.setNumero(cliente.getNumero());
            entityCadastrada.setCidade(cliente.getCidade());
            entityCadastrada.setEstado(cliente.getEstado());
    }
//    private Map <Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        this.map = new HashMap<>();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if(this.map.containsKey(cliente.getCpf())){ //se tiver o atributo cpf do cliente no map, false
//            return false;
//        }
//        this.map.put(cliente.getCpf(), cliente); //se nao, coloca o cpf, e o cliente no map, true
//        return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = this.map.get(cpf);
//
//        if (clienteCadastrado != null){
//            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//        }
//    }
//
//    @Override
//    public void alterar(Cliente cliente) { //obj de entrada
//        Long cpf = cliente.getCpf(); // tras o valor cpf do obj cliente
//
//        Cliente clienteCadastrado = this.map.get(cpf); //obj do map
//        if (clienteCadastrado != null){
//            clienteCadastrado.setNome(cliente.getNome()); //nome do obj no map,é = o nome do obj entrada
//            clienteCadastrado.setCpf(cliente.getCpf());
//            clienteCadastrado.setTel(cliente.getTel());
//            clienteCadastrado.setEnd(cliente.getEnd());
//            clienteCadastrado.setNumero(cliente.getNumero());
//            clienteCadastrado.setCidade(cliente.getCidade());
//            clienteCadastrado.setEstado(cliente.getEstado());
//        }
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//        return this.map.values();
//    }
}
