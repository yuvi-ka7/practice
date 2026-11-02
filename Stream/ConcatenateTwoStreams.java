
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(40, 50, 60);

        // Convert both lists into streams and combine them
        List<Integer> result = Stream.concat(
                    list1.stream(),
                    list2.stream()
                )
                .collect(Collectors.toList());

        System.out.println("Combined list: " + result);
    }
}
