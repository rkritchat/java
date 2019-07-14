package inheritance;

public abstract class Mom2 {

    abstract void process();
    private String x="5555";

    public Mom2() {
    }

    public Mom2(String x) {
        this.x = x;
    }


    public int plusXY(int x, int y) {
        process();
        return x + y;
    }

    public String getX() {
        return x;
    }
}
