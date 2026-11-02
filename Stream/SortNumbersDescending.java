
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersDescending {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);

        // Reverse the natural sorting order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending order: " + sortedNumbers);
    }
}
