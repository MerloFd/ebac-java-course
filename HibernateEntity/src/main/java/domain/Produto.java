package domain;

import javax.persistence.*;

@Entity
@Table (name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq", sequenceName = "prod_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name="codigo", length = 10, nullable = false, unique = true)
    private String codigo;
    @Column (name = "nome", nullable = false)
    private String nome;
    @Column(name = "valor", nullable = false)
    private Long valor;
    @Column (name = "descricao")
    private String descricao;
    @Column (name = "fornecedor", nullable = false)
    private String fornecedor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
