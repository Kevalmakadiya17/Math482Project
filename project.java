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

 // functions are generators for generating a list of colors for the puzzle //
    public static int generator1(int n) {
        return 1 + ((int) Math.floor(n * 40 * Math.PI) % 12);
    }

    public static int generator2(int n) {
        return 1 + ((int) Math.floor(n * 50 * Math.E) % 12);
    }

    public static int generator3(int n) {
        return 1 + ((int) Math.floor(n * 40 * Math.E) % 12);
    }

    public static int generator4(int n) {
        return 1 + ((int) Math.floor(n * 60 * Math.E) % 12);
    }

    public static int generator5(int n) {
        return 1 + ((int) Math.floor(n * 30 * Math.E) % 12);
    }

    public static int generator6(int n) {
        return 1 + ((int) Math.floor(n * 20 * Math.E) % 12);
    }
// Map is used to keep track of the count of each color in the list to ensure that no more than three of the same color are generated//
    public static List<Integer> generateColors(Function<Integer, Integer> generator) {
        List<Integer> colors = new ArrayList<>();
        Map<Integer, Integer> colorCounts = new HashMap<>();

        for (int i = 1; i <= 12; i++) {
            colorCounts.put(i, 0);
        }

        int i = 1;
        while (colors.size() < 36) {
            int color = generator.apply(i);
            if (colorCounts.get(color) < 3) {
                colors.add(color);
                colorCounts.put(color, colorCounts.get(color) + 1);
            }
            i++;
        }
        return colors;
    }
}