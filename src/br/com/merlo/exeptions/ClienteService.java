package br.com.merlo.exeptions;

public class ClienteService {

    public static void consultarCliente(String codigo) throws ClienteNaoEncontrado2Exception {
        try {
            ClienteDAO.consultarCliente(codigo);
        } catch (ClienteNaoEncontradoException e){ //TEM QUE PASSAR NOVAMENTE A EXCEPTION ORIGINAL
            throw new ClienteNaoEncontrado2Exception(e.getMessage(), e);
        }


    }
}