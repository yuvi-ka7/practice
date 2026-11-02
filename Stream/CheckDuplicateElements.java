
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateElements {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 2};

        Set<Integer> seen = new HashSet<>();

        // If an element is already present, we found a duplicate
        boolean hasDuplicate = Arrays.stream(nums)
                .anyMatch(n -> !seen.add(n));

        System.out.println("Contains duplicate: " + hasDuplicate);
    }
}
