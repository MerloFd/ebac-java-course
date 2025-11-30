package br.com.merlo.intermediarias;

import br.com.merlo.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class MapStream {
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        Stream stream = listagem.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("br"))
                .map(Pessoa::getIdade); //criou uma lista que tem somente as idades

        //mesmo exemplo, mas sem method reference
        Stream stream1 = listagem.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("br"))
                .map(pessoa -> pessoa.getIdade()); //criou uma lista que tem somente as idades

    }
}
