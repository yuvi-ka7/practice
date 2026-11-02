
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartingWithOne {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 15, 20, 11, 25, 100, 45, 123
        );

        // Convert each number to String and check its first digit
        List<Integer> result = numbers.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + result);
    }
}

