package thread;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiThread {
    public static void main(String... args) {

        List<Integer> dummy = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());

        /*
         * System will create thread 100 thread according to loop that we have.
         * no one can
         */
        /*for (Integer e : dummy) {
            new Thread(() -> show(e)).start();
        }*/

        System.out.println(Runtime.getRuntime().availableProcessors());  // print processor available per time

        dummy.parallelStream()
                .map(MultiThread::sleep)
                .forEach(MultiThread::show);

    }

    private static Integer sleep(Integer e) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {}
        return e;
    }

    private static void show(Integer e){
        System.out.println(e);
    }
}
