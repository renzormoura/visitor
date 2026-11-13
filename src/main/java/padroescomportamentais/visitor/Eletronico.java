package padroescomportamentais.visitor;

public class Eletronico implements Produto {

    private String nome;
    private float preco;

    public Eletronico(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public float aceitar(Visitor visitor) {
        return visitor.visitarEletronico(this);
    }
}
