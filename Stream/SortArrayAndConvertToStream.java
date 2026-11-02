
import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArrayAndConvertToStream {

    public static void main(String[] args) {

        int[] numbers = {50, 10, 40, 20, 30};

        // Sort the original array
        Arrays.sort(numbers);

        // Convert the sorted array into an IntStream
        IntStream stream = Arrays.stream(numbers);

        System.out.println("Sorted array elements:");

        stream.forEach(System.out::println);
    }
}
