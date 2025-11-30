package br.com.merlo.terminais;

import br.com.merlo.Pessoa;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        listagem.stream().forEach(i -> System.out.println(i));

        listagem.stream()
                .filter(pessoa -> pessoa.getIdade() == 18)
                .forEach(i->System.out.println(i));
    }
}
