package thread;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Use for block thread
 */
public class SynchronizedExample {
    private static final Calculator cal = new Calculator();
    private static final Calculator cal2 = new Calculator();


    public static void main(String... args) {
        List<Integer> dummy = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        dummy.parallelStream().map(SynchronizedExample::cal).forEach(e->{});
        dummy.parallelStream().map(SynchronizedExample::calWithSynchronized).forEach(e->{});
        cal.show();
        cal2.show();
    }

    /*
     * Some time it calculate wrong, we can fix this by using synchronized.
     * @param e
     * @return
     */
    private static Integer cal(Integer e){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e1) {e1.printStackTrace(); }
        cal.setSummation(cal.getSummation() + e);
        return e;
    }

    /*
     * This method away return collect result but it take time, because synchronized allow only one thread to work on this method
     * @param e
     * @return
     */
    private static synchronized Integer calWithSynchronized(Integer e){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e1) {e1.printStackTrace(); }
        cal2.setSummation(cal2.getSummation() + e);
        return e;
    }

    private static void sleep(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e1) {e1.printStackTrace(); }
    }

    private static class Calculator{
        private int summation;

        private void add(Integer e){
            summation += e;
        }

        private void show(){
            System.out.println("Result is : " + summation);
        }

        public int getSummation() {
            return summation;
        }

        public void setSummation(int summation) {
            this.summation = summation;
        }
    }

}

