import java.util.Scanner;

public class App {

    public static void main (String Args[]){
        System.out.println("calculadora básica de IR pessoa fisica e juridica");

        String nome = leitura("Digite seu nome: ");
        String tipo = leitura("Você é pessoa fisica ou juridica? (digite PF ou PJ)");

        if (tipo.equalsIgnoreCase("PF")){
            String cpf = leitura("Digite seu cpf: ");
            Double renda = Double.valueOf(leitura("Digite a sua renda mensal: "));
            PessoaFisica pf = criarPF(nome,cpf,renda);

            System.out.println("Resultado: ");
            System.out.println("Nome: " + pf.getNome());
            System.out.println("CPF: " + pf.getCpf());
            System.out.println("Renda de: " + "R$ " + pf.getRenda());
            System.out.println("Imposto a pagar: " + "R$ " + pf.pagarImposto(renda));
            System.out.println("A alíquota de IR será de: " + pf.getAliquotaPf()*100 + "%");

        } else if (tipo.equalsIgnoreCase("PJ")) {
            String cnpj = leitura("Digite seu cnpj: ");
            Double renda = Double.valueOf(leitura("Digite a sua renda mensal: "));
            System.out.println(renda);
            PessoaJuridica pj = criarPj(nome, cnpj,renda);

            System.out.println("Resultado: ");
            System.out.println("Nome: " + pj.getNome());
            System.out.println("CPF: " + pj.getCnpj());
            System.out.println("Renda de: " + "R$ " + pj.getRenda());
            System.out.println("Imposto a pagar: " + "R$ " + pj.pagarImposto(renda));
            System.out.println("A alíquota de IR será de: " + pj.getAliquotaPj()*100 + "%");

        } else {
            System.out.println("ERRO valor de entrada de PF ou PJ inválido.");
        }
    }

    public static String leitura(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static PessoaFisica criarPF(String nome, String cpf, Double renda){
        return new PessoaFisica(nome,cpf,renda);
    }
    public static PessoaJuridica criarPj(String nome, String cnpj, Double renda){
        return new PessoaJuridica(nome,cnpj,renda);
    }
}
