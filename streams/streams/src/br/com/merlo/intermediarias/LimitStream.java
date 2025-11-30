package br.com.merlo.intermediarias;

import br.com.merlo.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class LimitStream {
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        Stream<Pessoa> limitStream = listagem.stream().limit(2);

        limitStream.forEach(i->System.out.println(i));
    }
}
