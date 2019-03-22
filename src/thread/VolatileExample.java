package thread;


public class VolatileExample {

    public static void main(final String... args)  {

        Test a = new Test();

        Thread writer = new Thread(() -> {
            try {
                a.threadWrite();
                Thread.sleep(3000);
                a.stopProcess();  // call stop process on tread writer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() -> a.threadRead());

        writer.start();
        reader.start();
    }

    private static class Test {
        /**
         * Volatile guarantee that value chane will apply to other thread, if we not
         * add volatile some time it running by catch and we chan not modify it..
         */
        private volatile boolean flag = false;

        private void threadWrite() {
            flag = true;
        }

        private void threadRead() {
            while (flag) {
                System.out.println("Come here");
            }
        }

        private void stopProcess() {
            flag = false;
        }

    }

}
