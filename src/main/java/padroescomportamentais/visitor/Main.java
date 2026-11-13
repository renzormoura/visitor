package padroescomportamentais.visitor;

public class Main {

    public static void main(String[] args) {
        ImpostoVisitor imposto = new ImpostoVisitor();
        Produto[] carrinho = {
                new Livro("Padrões de Projeto", 100.0f),
                new Eletronico("Fone de ouvido", 200.0f),
                new Alimento("Arroz", 30.0f)
        };
        float total = 0;
        for (Produto produto : carrinho) {
            total += imposto.calcular(produto);
        }
        System.out.println("Imposto total do carrinho: R$ " + total);
    }
}
