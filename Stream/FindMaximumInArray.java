
import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaximumInArray {

    public static void main(String[] args) {

        int[] numbers = {10, 50, 20, 90, 30, 70};

        // Find the largest element in the array
        OptionalInt max = Arrays.stream(numbers).max();

        if (max.isPresent()) {
            System.out.println("Maximum element: " + max.getAsInt());
        } else {
            System.out.println("Array is empty");
        }
    }
}
