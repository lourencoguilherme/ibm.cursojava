package interfaces.test;

import interfaces.src.Circulo;
import interfaces.src.Programa;
import interfaces.src.Quadrado;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProgramaTest {

    @Test
    public void deveTestarCirculo() {
        Programa programa = new Programa();
        Circulo circulo = programa.montaCirculo();

        System.out.println(circulo);
        assertNotNull(circulo);
        assertNotNull(circulo.getComprimento());

    }

    @Test
    public void deveTestarQuadrado() {
        Programa programa = new Programa();
        Quadrado quadrado = programa.montaQuadrado();

        System.out.println(quadrado);

        assertNotNull(quadrado);
        assertNotNull(quadrado.getComprimento());

    }

}
