import java.util.ArrayList;
import java.util.List;

public class SequenceGenerator {
    public static void main(String[] args) {
        // Example usage:
        List<Integer> sequence = generateSequence("arithmetic", 5, 3, 5);
        sequence.forEach(System.out::println); // Outputs the sequence
        System.out.println("Sum: " + sumOrProductOfSequence(sequence, "sum")); // Outputs the sum
    }

    public static List<Integer> generateSequence(String type, int firstTerm, int common, int numberOfTerms) {
        if (type.equalsIgnoreCase("arithmetic")) {
            ArithmeticSequenceGenerator arithmetic = new ArithmeticSequenceGenerator();
            return arithmetic.generateArithmeticSequence(firstTerm, common, numberOfTerms);
        } else if (type.equalsIgnoreCase("geometric")) {
            GeometricSequenceGenerator geometric = new GeometricSequenceGenerator();
            return geometric.generateGeometricSequence(firstTerm, common, numberOfTerms);
        }
        return new ArrayList<>();
    }

    public static int sumOrProductOfSequence(List<Integer> sequence, String operation) {
        if (operation.equalsIgnoreCase("sum")) {
            return sequence.stream().reduce(0, Integer::sum);
        } else if (operation.equalsIgnoreCase("product")) {
            return sequence.stream().reduce(1, (a, b) -> a * b);
        }
        return -1;
    }
}
