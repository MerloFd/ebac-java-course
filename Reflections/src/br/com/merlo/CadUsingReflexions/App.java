package br.com.merlo.CadUsingReflexions;

import br.com.merlo.CadUsingReflexions.dao.ClienteMapDAO;
import br.com.merlo.CadUsingReflexions.dao.IClienteDAO;
import br.com.merlo.CadUsingReflexions.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO; //atributo do tipo Interface pra não dar erro, independente da implementacao

    public static void main (String Args[]){
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 consultar, 3 exclusão, 4 alteração, 5 sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){ //while valido repita, se for " " sai, caso outro, pergunte.
            if ("".equals(opcao)){
                sair();
            }
             opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida. Digite 1 para cadastro, 2 consultar, 3 exclusão, 4 alterar, 5 sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)){
            if (isOpcaoSair(opcao)){
                sair();
            } else if (isOpcaoCadastro(opcao)) { //validar os tipos dos valores de entrada
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula, exemplo: Nome, CPF, tel, endereço, número, cidade, estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastar(dados);

            } else if (isOpcaoConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf do cliente que deseja consultar",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);

            } else if (isOpcaoExclusao(opcao)) {

            } else if (isOpcaoAlterar(opcao)) {

            }

            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida. Digite 1 para cadastro, 2 consultar, 3 exclusão, 4 alterar, 5 sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        //validar se foi passado somente cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
         if (cliente != null){
             JOptionPane.showMessageDialog(null,cliente.toString() + " encontrado.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
         } else {
             JOptionPane.showMessageDialog(null, "Cliente nãp encontrado.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
         }
    }

    private static void cadastar(String dados) {
        String [] dadosSeparados = dados.split(",");
        //validar se todos os campos foram preenchidos.
        //se nao tiver, passar null no constructor
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente ja está cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoAlterar(String opcao) {
        if("4".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoExclusao(String opcao) {
        if("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoConsultar(String opcao) {
        if("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) { //metodo valida cadastro
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if("5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Saindo... ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) { //valida se e valido
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
                || "4".equals(opcao) || "5".equals(opcao) ){
            return true;
        }
        return false;
    }

}
