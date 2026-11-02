
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CheckListUsingOptional {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "John", "David", "Smith", "Robert"
        );

        // Optional handles the case where the list itself is null
        Optional.ofNullable(names)
                .filter(list -> !list.isEmpty())
                .ifPresentOrElse(
                    list -> {
                        // Print each element when the list has values
                        list.forEach(System.out::println);
                    },
                    () -> System.out.println("List is null or empty")
                );
    }
}
