package padroescomportamentais.visitor;

public class Alimento implements Produto {

    private String nome;
    private float preco;

    public Alimento(String nome, float preco) {
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
        return visitor.visitarAlimento(this);
    }
}
