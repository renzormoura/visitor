package padroescomportamentais.visitor;

public class ImpostoVisitor implements Visitor {

    public float calcular(Produto produto) {
        return produto.aceitar(this);
    }

    @Override
    public float visitarLivro(Livro livro) {
        return 0.0f;
    }

    @Override
    public float visitarEletronico(Eletronico eletronico) {
        return eletronico.getPreco() * 0.25f;
    }

    @Override
    public float visitarAlimento(Alimento alimento) {
        return alimento.getPreco() * 0.05f;
    }
}
