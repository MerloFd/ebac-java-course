package br.com.merlo.generics;

import br.com.merlo.generics.dao.CarrosDAO;
import br.com.merlo.generics.dao.ICarrosDAO;
import br.com.merlo.generics.domain.Carro;
import br.com.merlo.generics.domain.Ford;
import br.com.merlo.generics.domain.Honda;
import br.com.merlo.generics.domain.Volkswagen;

import javax.swing.*;

public class App {

    private static ICarrosDAO iCarrosDAO;

    public static void main(String[] args) {
        iCarrosDAO = new CarrosDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para fazer um pedido ou digite 2 para consultar um pedido  (3 para sair)",
                "Carros Personalizados ltda", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){ //while invalido repita, se for " " sai, caso outro, pergunte
            if ("".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida. 1 para efetuar pedido e 2 para acompanhar pedido (3 para sair)",
                    "Carros Personalizados ltda", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)){
            if (isOpcaoPedir(opcao)){
                pedido();

            } else if (isOpcaoConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf usado no cadastro do pedido: ",
                        "Carros Personalizados ltda", JOptionPane.INFORMATION_MESSAGE);
                consultarPedidos(dados);

            } else if (isOpcaoSair(opcao)){
                sair();
            }

            //retorna pra input o valor de opcao
             opcao = JOptionPane.showInputDialog(null,
                     "Digite 1 para fazer um pedido ou digite 2 para consultar um pedido  (3 para sair)",
                    "Carros Personalizados ltda", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private static void pedido(){
        String opcao = JOptionPane.showInputDialog(null,
                "Escolha a marca do carro: 1 Honda, 2 Ford, 3 Volksvagen",
                "Carros Personalizados ltda", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){ //while valido repita, se for " " sai, caso outro, pergunte.
            if ("".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida. 1 Honda, 2 Ford, 3 Volksvagen",
                    "Carros Personalizados ltda", JOptionPane.INFORMATION_MESSAGE);
        }

            if (isHonda(opcao)) {
                String model = "Honda";
                String dados = JOptionPane.showInputDialog(null,
                        "Digite as infromações do carro separadas por vírgula, exemplo: CPF, modelo, cor, potencia, freio automatico? (S/N)",
                        "Pedido", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados,model);

            } else if (isFord(opcao)) {
                String model = "Ford";
                String dados = JOptionPane.showInputDialog(null,
                        "Digite as infromações do carro separadas por vírgula, exemplo: CPF, modelo, cor, potencia, blindado? (S/N)",
                        "Pedido", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados,model);

            } else if (isVolkwagen(opcao)) {
                String model = "Volkswagen";
                String dados = JOptionPane.showInputDialog(null,
                        "Digite as infromações do carro separadas por vírgula, exemplo: CPF, modelo, cor, potencia, teto solar? (S/N)",
                        "Pedido", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados,model);
            }
    }

    private static void cadastrar(String dados, String model) {
        String[] dadosSeparados = dados.split(",");
        String acessorioModelo = dadosSeparados[4];

        //validacao de S ou N no boolean das classes de modelo de carro, logica de comparacao esta na classe
        if (!acessorioModelo.equalsIgnoreCase("S") || !acessorioModelo.equalsIgnoreCase("n")){
            dados= JOptionPane.showInputDialog(null,
                    "BOOLEAN Informações digitadas erradas. Digite as infromações do carro separadas por vírgula, exemplo: CPF, modelo, cor, potencia, teto solar? (S/N)",
                    "Pedido", JOptionPane.INFORMATION_MESSAGE);
            dadosSeparados = dados.split(",");
        }

        //validacao de campos preenchidos
        if (dadosSeparados.length < 4) {
            String dados2 = JOptionPane.showInputDialog(null,
                    "Informações digitadas erradas. Digite as infromações do carro separadas por vírgula, exemplo: CPF, modelo, cor, potencia, teto solar? (S/N)",
                    "Pedido", JOptionPane.INFORMATION_MESSAGE);
            dados = dados2;
            dadosSeparados = dados.split(",");
        }

        switch (model) {
            case "Honda":
                Honda modeloH = new Honda(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4]);

                Boolean isCadastradoH = iCarrosDAO.cadastrarPedido(modeloH);
                if (isCadastradoH) {
                    JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pedido ja está cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
                }

                break;

            case "Ford":
                Ford modeloF = new Ford(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4]);

                Boolean isCadastradoF = iCarrosDAO.cadastrarPedido(modeloF);
                if (isCadastradoF) {
                    JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pedido ja está cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
                }
                    break;

            case "Volkswagen":
                 Volkswagen modeloV = new Volkswagen(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4]);

                 Boolean isCadastradoV = iCarrosDAO.cadastrarPedido(modeloV);
                 if (isCadastradoV) {
                            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                 } else {
                     JOptionPane.showMessageDialog(null, "Pedido ja está cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);

                 }
                     break;
        }
    }

    public static void consultarPedidos(String dados){
        Long codigo = Long.parseLong(dados);
        Carro carroConsultado = iCarrosDAO.consultarPedidos(codigo);

        if (carroConsultado != null) {
            JOptionPane.showMessageDialog(null, "Pedido encontrado: " + carroConsultado.toString(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pedido não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static boolean isVolkwagen(String opcao) {
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isFord(String opcao) {
        if ("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isHonda(String opcao) {
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Saindo... ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoConsultar(String opcao) {
        if ("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoPedir(String opcao) {
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)){
            return true;
        }
        return false;
    }

}