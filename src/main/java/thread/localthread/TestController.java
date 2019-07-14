package thread.localthread;

public class TestController {

    /**
     * If dummy is just int, thread will access same object and it not safe..
     * for avoid that we need to use ThreadLocal or synchronize.
     */
    //private int dummy = 0;
    private ThreadLocal<Integer> dummy = ThreadLocal.withInitial(() -> 0);

    public void execute(){
        System.out.println(dummy.get());
    }

    public void add(){
        dummy.set(10);
    }

}
