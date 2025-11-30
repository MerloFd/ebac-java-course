package br.com.merlo.terminais;

import br.com.merlo.Pessoa;

import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        long count = listagem.stream().filter(pessoa -> pessoa.getIdade() == 18)
                .count();
        System.out.println(count);
    }
}
