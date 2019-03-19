public class TestAbstract  {
    public static void main(String... args) {
        Plus p = new Plus();
        System.out.println(p.cal(1, 2));

    }


}

class Plus extends Calculate{
    @Override
    void show() {
        log("call show");
    }

    public int cal(int x,int y) {
        log("Calculate from plus");
        return x+y;
    }
}

abstract class Calculate {
    abstract  void show();

    protected static void log(String sentence) {
        System.out.println("----- Log : " + sentence + " -----");
    }

    protected static void test() {
        System.out.println("Worked");
    }
}
