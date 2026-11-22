import java.util.*;
import java.util.stream.Stream;
class Main {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // Stream<Integer> s = numbers.stream();
        // s= s.filter(n -> n % 2 == 0);
        // s.forEach(System.out::println);
        s.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}