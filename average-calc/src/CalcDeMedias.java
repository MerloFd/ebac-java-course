import java.util.Scanner;

/**
 * @author MerloFd
 * @version 0.1
 */

public class CalcDeMedias {

    public static void titulo (){
        System.out.println("Calculadora de médias");
    }

    /**
     * Método que soma todas as notas obtidas
     * E aloca esse resultado na variável somaNotas
     * @return somaNotas
     */
    public int notasAlunos (){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota da primeira atividade: ");
        int nota1 = scan.nextInt();
        System.out.println("Digite a nota da segunda atividade: ");
        int nota2 = scan.nextInt();
        System.out.println("Digite a nota da terceira atividade: ");
        int nota3 = scan.nextInt();
        System.out.println("Digite a nota da quarta atividade: ");
        int nota4 = scan.nextInt();

        int somaNotas = nota1 + nota2 + nota3 + nota4;

        return somaNotas;
    }

    /**
     * Método que pega o valor de somaNotas, divide pela quantia de tarefas
     * E retorna esse resultado na variável media
     * @return media
     */
    public int mediaFinal (){
        int somaNotas = notasAlunos();
        int qtdTarefas = 4;

        int media = (somaNotas / qtdTarefas);

        return media;
    }

    /**
     * Método que instância o objeto calculadora
     * Faz validação se o aluno foi reprovado ou aprovado
     * E Imprime os valores no console
     */
    public static void main (String [] Args) {
        CalcDeMedias calculadora = new CalcDeMedias();
        int media = calculadora.mediaFinal();

        Scanner scan = new Scanner(System.in);

        //validação de aprovação do aluno com base na nota minina
        System.out.println("Digite a nota média minima: ");
        int notaMinima = scan.nextInt();
        String resultado;
        if (media >= notaMinima){
            resultado = "aprovado";
        }else if (media >= 5) {
            resultado = "de recuperação";
        } else {
            resultado = "reprovado";
        }

        //imprime tudo no console
        System.out.println("A média final do aluno(a) é: "+ media);
        System.out.println("O aluno(a) está " + resultado);
    }
}
