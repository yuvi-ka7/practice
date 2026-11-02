
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumInList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 50, 20, 90, 30);

        // Find the largest number in the list
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        System.out.println("Maximum value: " + max.orElse(null));
    }
}
