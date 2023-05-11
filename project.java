import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class InstantInsanity {

    public static void main(String[] args) {
        List<Function<Integer, Integer>> generators = List.of(
                InstantInsanity::generator1,
                InstantInsanity::generator2,
                InstantInsanity::generator3,
                InstantInsanity::generator4,
                InstantInsanity::generator5,
                InstantInsanity::generator6
        );
for (int i = 0; i < generators.size(); i++) {
            List<Integer> colors = generateColors(generators.get(i));
            System.out.println("Puzzle " + (i + 1) + ":");
            for (int j = 0; j < colors.size(); j += 3) {
                System.out.println("Slice " + (j / 3 + 1) + ": (" + colors.get(j) + ", " + colors.get(j + 1) + ", " + colors.get(j + 2) + ")");
            }
        }
    } 