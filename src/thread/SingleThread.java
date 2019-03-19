package thread;

import java.util.Arrays;
import java.util.List;

class SingleThread {

    public static void main(String... args) throws InterruptedException {

        List<Integer> cars = Arrays.asList(5, 8, 1, 6);

        final Dummy dummy = new Dummy();

        Runnable task = () -> {
            int sum = 0;
            for (Integer tmp : cars) {
                sum += tmp;
                System.out.println(Thread.currentThread().getName());
            }
            System.out.println(sum);
            dummy.setSum(sum);
        };

        Thread calculator = new Thread(task);

        System.out.println("Before[start] thread state:" + calculator.getState());  // Thread state is NEW
        calculator.start();
        System.out.println("After[start] thread state: " + calculator.getState());  // Thread state is RUNNABLE
        Thread.sleep(5000);
        System.out.println("After[start] and wait 5s thread state: " + calculator.getState()); // after sometime Thread state is TERMINATED because his job is done.
        /*
        *  This will show name difference with calculator, we got 2 thread right now 1.main 2.calculator
         */
        System.out.println(Thread.currentThread().getName());
        System.out.println(dummy.getSum());
    }

    static class Dummy{
        private int sum;

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }

}