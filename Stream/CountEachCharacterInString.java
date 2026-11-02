
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

    public static void main(String[] args) {

        String str = "programming";

        // Convert the string into a stream of characters
        Map<Character, Long> frequency = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting()
                ));

        // Print each character along with its count
        frequency.forEach((character, count) ->
            System.out.println(character + " : " + count)
        );
    }
}
