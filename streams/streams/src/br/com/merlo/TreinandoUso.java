package br.com.merlo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TreinandoUso {
    public static void main(String[] args) {
        Stream<String> streamNum = List.of("a","b","c","d","e","f","g","h","i","j","k","l").stream();

        Stream<Pessoa> stream1 = List.of(
                new Pessoa("id","nome", "br", 18),
                new Pessoa("id","nome1", "br", 19),
                new Pessoa("id","nome1", "br", 19),
                new Pessoa("id","nome2", "us", 21))
                .stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("br"));

        stream1.forEach(i->System.out.println(i));

        System.out.println("--ordenando com sorted--");

        List<Pessoa> listagem = new Pessoa().populaPessoas();

        Stream<Pessoa> stream2 = listagem.stream().sorted(Comparator.comparing(Pessoa::getIdade));
        stream2.forEach(i->System.out.println(i));
     }
}
