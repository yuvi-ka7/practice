
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 20, 10, 30, 20, 10, 40
        );

        // Count how many times each number appears
        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));

        System.out.println("Frequency: " + frequency);
    }
}
