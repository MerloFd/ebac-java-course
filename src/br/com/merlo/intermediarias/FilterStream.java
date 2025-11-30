package br.com.merlo.intermediarias;

import br.com.merlo.Pessoa;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterStream {
    //filter filtra e retorna os obj que atendem a condicao do predicate usando lambda

    //declaração da listagem, menciona a lista na classe Pessoa
    List<Pessoa> listagem = new Pessoa().populaPessoas();

    //usando .stream() e filter logo em seguida, passando condição no predicate com lambda
    Stream stream = listagem.stream().filter(pessoa -> pessoa.getNacionalidade().equals("br"));

    //criando a lambda primeiro e depois usando stream e filter
    Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("br");
    Stream stream1 = listagem.stream().filter(pred);

    //fazendo a mesmissima coisa usando classe anonima:
    Predicate<Pessoa> pred1= new Predicate<Pessoa>() {
        @Override
        public boolean test(Pessoa pessoa) {
            return pessoa.getNacionalidade().equals("br");
        }
    };
    Stream stream2 = listagem.stream().filter(pred1);
}
