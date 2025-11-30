package br.com.merlo.exeptions;

import javax.swing.*;
import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "titulo",JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontrado2Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
