package br.com.merlo.terminais;

import br.com.merlo.Pessoa;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        //fazer com stream
        Boolean result = listagem.stream()
                .allMatch((pessoa -> pessoa.getNacionalidade().equals("br")));
        System.out.println(result);

        //fazer no modo convencional
        Boolean re = true;
        for (Pessoa p : listagem){
            if (!p.getNacionalidade().equals("us")){
                re = false;
                break;
            }
        }
        System.out.println(re);
    }
}
