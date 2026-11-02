
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeAndFilterNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        // Cube each number and keep only cubes greater than 50
        List<Integer> result = numbers.stream()
                .map(n -> n * n * n)
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}
