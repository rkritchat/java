package thread;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String... args) {

        List<Integer> dummy = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        dummy.parallelStream().forEach(ParallelStreamExample::show);  //This will not order result

        System.out.println();

        dummy.parallelStream().forEachOrdered(ParallelStreamExample::show); //This will order result
    }

    private static void show(Integer e){
        System.out.print("-" + e + "-");
    }
}
