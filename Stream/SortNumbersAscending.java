
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersAscending {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);

        // Sort the numbers from smallest to largest
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + sortedNumbers);
    }
}
