
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.*;

public class TestAtletaCRUD {
    
    @Test
    public void testaAdicionar(){
        AtletaCRUD selecao = new AtletaCRUD();
        Atleta x = new PilotoDeFormula1("Murillo", 22, 10000000, 0.3);
        selecao.adicionar(x);
        Atleta y = new CyberAtleta("Rodrigo", 25, 9, "Top 1");
        selecao.adicionar(y);
        assertEquals("Murillo", selecao.getAtletas().get(0).getNome());
        assertEquals("Rodrigo", selecao.getAtletas().get(1).getNome());
    }

}
