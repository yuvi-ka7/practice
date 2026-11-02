
import java.util.Arrays;
import java.util.List;

public class CountListElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Count how many elements are present in the list
        long count = numbers.stream().count();

        System.out.println("Total elements: " + count);
    }
}
