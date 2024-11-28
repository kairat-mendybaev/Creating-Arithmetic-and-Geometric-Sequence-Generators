import java.util.ArrayList;
import java.util.List;

public class ArithmeticSequenceGenerator {
    public List<Integer> generateArithmeticSequence(int firstTerm, int commonDifference, int numberOfTerms) {
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < numberOfTerms; i++) {
            sequence.add(firstTerm + i * commonDifference);
        }
        return sequence;
    }
}
