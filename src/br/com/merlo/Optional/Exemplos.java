package br.com.merlo.Optional;

import br.com.merlo.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exemplos {

    //  Optional serve para evitar nullPointerException
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        //pega o maior valor (max) do valor do comparing
        Optional<Pessoa> maximo = listagem.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        //usa um método de verificacao do Opctional
        if (maximo.isPresent()){
            System.out.println(maximo.get());
        }

        //ou, com method reference:

        maximo.ifPresent(System.out::println);

        Optional<Pessoa> minimo = listagem.stream()
                .min(Comparator.comparing(Pessoa::getIdade));

        if (minimo.isPresent()) {
            System.out.println(minimo);
        }

        //verificando com if else o minimo, usando um metodo Optional, (consumer, new runnable)
        // se else, usa uma thread pra verificar em outro local
        minimo.ifPresentOrElse(System.out::println, new Runnable() {
            @Override
            public void run() {
                //buscar dnv em outro local
            }
        });

        //ou se caso não existir, levanta um throw
        Pessoa value = minimo.orElseThrow();


    }
}
