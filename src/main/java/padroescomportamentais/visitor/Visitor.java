package padroescomportamentais.visitor;

public interface Visitor {

    float visitarLivro(Livro livro);
    float visitarEletronico(Eletronico eletronico);
    float visitarAlimento(Alimento alimento);

}
