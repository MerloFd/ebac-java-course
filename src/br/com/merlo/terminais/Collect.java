package br.com.merlo.terminais;

import br.com.merlo.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        System.out.println("Lista completa");
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        for (Pessoa pessoa : listagem) {
            System.out.println(pessoa);
        }

        System.out.println("List com pessoas de idade 18 usando Collect");

             listagem.stream()
                .filter(pessoa -> pessoa.getIdade()==18)
                .collect(Collectors.toList())
                .forEach(i->System.out.println(i));


        System.out.println("Set de pessoas com 18");

        Set<Pessoa> set = listagem.stream()
                .filter(pessoa -> pessoa.getIdade()==18)
                .collect(Collectors.toSet());
        set.forEach(i->System.out.println(i));

        System.out.println("ArrayList com pessoas da lista");

        List<Pessoa> arrayList = listagem.stream()
                .filter(pessoa -> pessoa.getIdade()==18)
                .collect(Collectors.toCollection(ArrayList::new));

        arrayList.forEach(i->System.out.println(i));

        System.out.println("Map com pessoas da lista");

        Map<String,Pessoa> mapList = listagem.stream()
                .collect(Collectors.toMap(Pessoa::getNome, Pessoa::new));
        mapList.forEach((k,v)->System.out.println(k + " / " + v));

        System.out.println("Map com pessoas da lista, que agrupa as pessoas que te a mesma idade");

        Map<Integer, List<Pessoa>> grupoPorIdade = listagem.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        grupoPorIdade.forEach((k,v)->System.out.println(k + " / " + v));
    }
}
