
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateStringsWithCount {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Java", "Python", "Java", "C++",
            "Python", "Java", "Spring", "C++"
        );

        // Count the occurrence of every string
        Map<String, Long> frequency = names.stream()
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));

        // Print only strings that occur more than once
        frequency.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry ->
                    System.out.println(
                        entry.getKey() + " : " + entry.getValue()
                    )
                );
    }
}
