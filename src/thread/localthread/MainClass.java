package thread.localthread;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This is example of thread local
 * So in this example we create one object that call TestController
 * and use parallelStream to create multi thread...
 * event we use same controller, system away print 10
 * because we use localThread.
 */
public class MainClass {

    public static void main(final String... args) {

        TestController testController = new TestController();

        List<Integer> integers = IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());

        integers.parallelStream().forEach(e -> {
            testController.add();
            testController.execute();
        });

    }

}
