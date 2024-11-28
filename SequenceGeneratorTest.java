import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class SequenceGeneratorTest {
    @Test
    public void testArithmeticSequence() {
        ArithmeticSequenceGenerator arithmetic = new ArithmeticSequenceGenerator();
        assertEquals(Arrays.asList(5, 8, 11, 14, 17), arithmetic.generateArithmeticSequence(5, 3, 5));
    }

    @Test
    public void testGeometricSequence() {
        GeometricSequenceGenerator geometric = new GeometricSequenceGenerator();
        assertEquals(Arrays.asList(3, 6, 12, 24, 48), geometric.generateGeometricSequence(3, 2, 5));
    }

    @Test
    public void testSumArithmeticSequence() {
        List<Integer> sequence = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, SequenceGenerator.sumOrProductOfSequence(sequence, "sum"));
    }

    @Test
    public void testProductGeometricSequence() {
        List<Integer> sequence = Arrays.asList(2, 4, 8);
        assertEquals(64, SequenceGenerator.sumOrProductOfSequence(sequence, "product"));
    }

    @Test
    public void testEmptyArithmeticSequence() {
        ArithmeticSequenceGenerator arithmetic = new ArithmeticSequenceGenerator();
        assertTrue(arithmetic.generateArithmeticSequence(5, 5, 0).isEmpty());
    }

    @Test
    public void testEmptyGeometricSequence() {
        GeometricSequenceGenerator geometric = new GeometricSequenceGenerator();
        assertTrue(geometric.generateGeometricSequence(3, 3, 0).isEmpty());
    }
}
