
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        String str = "swiss";

        Set<Character> seen = new HashSet<>();

        // The first character that cannot be added again is repeated
        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c))
                .findFirst()
                .orElse(null);

        System.out.println("First repeated character: " + result);
    }
}
