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
        