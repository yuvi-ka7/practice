
import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Get the first element from the stream
        numbers.stream()
                .findFirst()
                .ifPresent(n -> System.out.println("First element: " + n));
    }
}
