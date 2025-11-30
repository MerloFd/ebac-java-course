import java.util.*;

public class LeituraNomes {

    public static void main(String[] args) {
        listaDeNomes();
        listaGenero();
    }
    private static void listaDeNomes() {
        System.out.println("xxxNomes por ordem alfabéticaxxx");
        System.out.println("Digite os nomes separados por ','");

        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String[] nomesSeparados = entrada.split(",");

        List<String> arrayNome = new ArrayList<String>(); //instânciando a lista

        for (String nome : nomesSeparados) { //iterando o array com a entrada de nomes e adicionando eles na list
            arrayNome.add(nome.trim());
        }

        Collections.sort(arrayNome); //dando ordenação alfabética pra lista

        for (String nome : arrayNome) { //iterando os elementos da lista e imprimindo-os em ordem alfabética
            System.out.println(nome);
        }

    }
    private static void listaGenero() {
        System.out.println("xxxNomes separados por grupos de genêroxxx");
        System.out.println("Digite os nomes com o genêro separado por '-m' ou '-f' separados por ','  ");
        System.out.println("Exemplo: matheus-m,livia-f, ...");

        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String[] nomesSeparados = entrada.split(",");

        List<String> listaF = new ArrayList<String>();
        List<String> listaM = new ArrayList<String>();

        //lógica de separação e iteração dos nomes
        for (String nomes : nomesSeparados){
            if (nomes.contains("-M") || nomes.contains("-m")){
                listaM.add(nomes.trim());
            } else if (nomes.contains("-F") || nomes.contains("-f")) {
                listaF.add(nomes.trim());
            }else { System.out.println("ERRO um item com entrada de genênero inválida, (digite nome-f ou nome-m)");
            }
        }
        //ordenando os nomes e imprimindo as respectivas listas
        Collections.sort(listaF);

        System.out.println("Lista genêro feminino: ");
        for (String nome : listaF) {
            System.out.println(nome);
        }
        Collections.sort(listaM);

        System.out.println("Lista genêro masculino: ");
        for (String nome : listaM){
            System.out.println(nome);
        }
    }
}