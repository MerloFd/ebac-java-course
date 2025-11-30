package br.com.merlo.exeptions;

public class ClienteDAO {

public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        //buscar no banco
        Boolean isCadastrado = false;

        if (!isCadastrado){
        throw new ClienteNaoEncontradoException("cliente não encontrado no banco de dados");
        }
    }
}
