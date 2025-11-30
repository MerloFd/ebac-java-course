public abstract class Pessoa {
    private String nome;
    private Double renda;

    public Pessoa(String nome, Double renda){
        this.nome=nome;
        this.renda=renda;
    }

    public abstract Double pagarImposto(Double renda);

    public String getNome() {
        return nome;
    }

    public Double getRenda() {
        return renda;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + '\'' +
                ", renda=" + renda +
                '}';
    }
}
