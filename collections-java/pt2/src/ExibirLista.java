import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExibirLista {

    public static void main(String[] args) {
        insertDados();
    }
    private static void insertDados() {
        String nomeDigitado;
        String sexoDigitado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nomeDigitado = scan.nextLine();
        System.out.println("Digite seu sexo: ");
        sexoDigitado = scan.nextLine().trim(); //tira os espaços em branco e torna válido um valor de entrada correto que tenha espaços em branco

        if (sexoDigitado.equalsIgnoreCase("f") || sexoDigitado.equalsIgnoreCase("feminino")) {
            String sexoFeminino = sexoDigitado;

            List<Pessoa> listagemF = new ArrayList<Pessoa>();
            Pessoa mulher = new Pessoa("Lista de mulheres" ,nomeDigitado, sexoFeminino); //cria o objeto pessoa
            listagemF.add(mulher);

            System.out.println(listagemF);

        } else if (sexoDigitado.equalsIgnoreCase("m") || sexoDigitado.equalsIgnoreCase("masculino")) {
            String sexoMaculino = sexoDigitado;

            List<Pessoa> listagemM = new ArrayList<Pessoa>();
            Pessoa homem = new Pessoa("Lista de homens" ,nomeDigitado, sexoMaculino); //cria o objeto pessoa
            listagemM.add(homem);

            System.out.println(listagemM);

        }else {
            System.out.println("ERRO valor do campo sexo inválido");
        }
    }
}
