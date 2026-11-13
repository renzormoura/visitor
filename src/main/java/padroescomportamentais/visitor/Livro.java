package padroescomportamentais.visitor;

public class Livro implements Produto {

    private String titulo;
    private float preco;

    public Livro(String titulo, float preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPreco() {
        return preco;
    }

    public float aceitar(Visitor visitor) {
        return visitor.visitarLivro(this);
    }
}
