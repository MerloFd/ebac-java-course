public class PessoaFisica extends Pessoa{
    private String cpf;

    private Double aliquotaPf;

    public PessoaFisica(String nome, String cpf, Double renda){
        super(nome,renda);
        this.cpf=cpf;
    }

    @Override
    public Double pagarImposto(Double renda) {
        double aliquota = 0;
        if (renda <= 2112){
            aliquota = 0;
        } else if (renda > 2112 && renda <= 2826.65 ) {
            aliquota = 0.075;
        } else if (renda >= 2826.66 && renda <= 3751.05) {
            aliquota = 0.15;
        } else if (renda >= 3751.06 && renda <= 4664.68) {
            aliquota = 0.225;
        } else if (renda >= 4664.69){
            aliquota = 0.275;
        }

        setAliquotaPf(aliquota);

        double totalPagar;
        totalPagar = renda * getAliquotaPf();

        return totalPagar;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getAliquotaPf() {
        return aliquotaPf;
    }

    public void setAliquotaPf(Double aliquotaPf) {
        this.aliquotaPf = aliquotaPf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", aliquotaPf=" + aliquotaPf +
                '}';
    }
}
