package thread;

class ThreadExample {

    public static void main(String... args) {
        Thread test = new Thread(() -> {
            System.out.println("test");
        });
        test.run();
        System.out.println(test.getState());
    }
}