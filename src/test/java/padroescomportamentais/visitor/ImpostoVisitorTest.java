package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpostoVisitorTest {

    @Test
    void deveCalcularImpostoLivro() {
        ImpostoVisitor visitor = new ImpostoVisitor();
        assertEquals(0.0f, visitor.calcular(new Livro("Padrões de Projeto", 100.0f)), 0.01f);
    }

    @Test
    void deveCalcularImpostoEletronico() {
        ImpostoVisitor visitor = new ImpostoVisitor();
        assertEquals(50.0f, visitor.calcular(new Eletronico("Fone de ouvido", 200.0f)), 0.01f);
    }

    @Test
    void deveCalcularImpostoAlimento() {
        ImpostoVisitor visitor = new ImpostoVisitor();
        assertEquals(1.5f, visitor.calcular(new Alimento("Arroz", 30.0f)), 0.01f);
    }
}
