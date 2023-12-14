import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculadoraHanoiTest {

    @Test
    public void testMetodoCalcularComZeroDiscos() {
        CalculadoraHanoi calculadora = new CalculadoraHanoi();
        assertEquals(0, calculadora.metodoCalcular(0), 0.01);
    }

    @Test
    public void testMetodoCalcularComUmDisco() {
        CalculadoraHanoi calculadora = new CalculadoraHanoi();
        assertEquals(1, calculadora.metodoCalcular(1), 0.01);
    }

    @Test
    public void testMetodoCalcularComTresDiscos() {
        CalculadoraHanoi calculadora = new CalculadoraHanoi();
        assertEquals(7, calculadora.metodoCalcular(3), 0.01);
    }
}
