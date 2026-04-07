import org.junit.Test;
import page_2.ddd;

import static org.junit.Assert.assertEquals;


public class TestandoTest {


    @Test
    public void EstadoBrasilia (){

        String resultadoEsperado = "Brasilia";
        String resultadoTestado = ddd.exibirDDD(61);
        assertEquals(resultadoEsperado,resultadoTestado);
    }

    @Test
    public void EstadoSalvador (){

        String resultadoEsperado = "Salvador";
        String resultadoTestado = ddd.exibirDDD(71);
        assert resultadoEsperado.equals(resultadoTestado);
    }
}
