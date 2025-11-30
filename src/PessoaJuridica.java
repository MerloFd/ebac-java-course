public class PessoaJuridica extends Pessoa{
    private String cnpj;

    private Double aliquotaPj;

    public PessoaJuridica(String nome, String cnpj, Double renda) {
        super(nome,renda);
        this.cnpj=cnpj;
    }

    @Override
    public Double pagarImposto(Double renda) {
        // a maneira de declarar e pagar imposto de pj e mais complexo, isso e uma adptacao
        double aliquota = 0.15;
        double aliquotaAdicional = 0;
        if (renda <= 20000){
            aliquotaAdicional = 0.10;
        }

        double totalPagar;
        double aliquotaTotal;

        aliquotaTotal = aliquota + aliquotaAdicional;
        totalPagar = renda * aliquotaTotal;

        setAliquotaPj(aliquotaTotal);
        return totalPagar;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Double getAliquotaPj() {
        return aliquotaPj;
    }

    public void setAliquotaPj(Double aliquotaPj) {
        this.aliquotaPj = aliquotaPj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", aliquotaPj=" + aliquotaPj +
                '}';
    }
}
