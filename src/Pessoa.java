public class Pessoa {
    private String genero;
    private String nome;
    private String sexo;

    public Pessoa(String genero , String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return " '" + genero + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
