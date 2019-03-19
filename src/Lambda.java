import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String... args) {

        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(calculate(data, e -> e % 2 != 0));
        System.out.println(calculate(data, e -> e % 2 == 0));
        System.out.println(calculate(data, e->true));
    }

    public static int calculate(List<Integer> data, Predicate<Integer> predicate) {
        return data.stream()
                .filter(predicate)
                .mapToInt(e->e)
                .sum();
    }



}
