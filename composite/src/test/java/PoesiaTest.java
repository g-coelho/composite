import org.example.Estrofe;
import org.example.Poesia;
import org.example.Verso;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PoesiaTest {

    @Test
    public void deveRetornarVersosPoesia(){
        Verso verso1 = new Verso("Tu não verás Marília, cem cativos");
        Verso verso2 = new Verso(" tirarem o cascalho e a rica terra,");
        Verso verso3 = new Verso(" ou dos cercos dos rios caudalosos,");
        Verso verso4 = new Verso(" ou da mina serra.");

        Estrofe estrofe1 = new Estrofe("Primeira Estrofe");

        estrofe1.addVersos(verso1);
        estrofe1.addVersos(verso2);
        estrofe1.addVersos(verso3);
        estrofe1.addVersos(verso4);

        Poesia poesia = new Poesia();
        poesia.setVerso(estrofe1);

        assertEquals("Estrofe: Primeira Estrofe" + "\n" +
                "Tu não verás Marília, cem cativos tirarem o cascalho e a rica terra, ou dos cercos dos rios caudalosos, ou da mina serra.",
                poesia.getVersos());


    }


    @Test
    public void deveRetornarExecacaoDisciplinaSemEmenta() {
        try {
            Poesia poesia = new Poesia();
            poesia.getVersos();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Poesia sem versos", e.getMessage());
        }
    }

}
