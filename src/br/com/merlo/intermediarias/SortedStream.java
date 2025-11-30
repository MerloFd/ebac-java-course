package br.com.merlo.intermediarias;

import br.com.merlo.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedStream {
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        System.out.println("---Comparando nomes---");

        Stream<Pessoa> streamSorted = listagem.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("br"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        streamSorted.forEach(i -> System.out.println(i));

        System.out.println("---Comparando idades---");

        Stream streamIdades = listagem.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("br"))
                .sorted(Comparator.comparing(Pessoa::getIdade));
                // aqui com method reference ele pega ordenação natural, menor pro maior

        streamIdades.forEach(i->System.out.println(i));

        System.out.println("---Comparando idades 2---");

        Stream streamIdades1 = listagem.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("br"))
                .sorted((p1,p2)-> Integer.compare(p2.getIdade(), p1.getIdade()));
                // da pra inverter a ordem de comparação, explicitando na lambda

        streamIdades1.forEach(i->System.out.println(i));
    }
}
