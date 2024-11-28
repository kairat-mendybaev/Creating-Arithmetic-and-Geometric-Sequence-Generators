import java.util.ArrayList;
import java.util.List;

public class GeometricSequenceGenerator {
    public List<Integer> generateGeometricSequence(int firstTerm, int commonRatio, int numberOfTerms) {
        List<Integer> sequence = new ArrayList<>();
        int currentTerm = firstTerm;
        for (int i = 0; i < numberOfTerms; i++) {
            sequence.add(currentTerm);
            currentTerm *= commonRatio;
        }
        return sequence;
    }
}
