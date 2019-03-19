package generic;

public abstract class People {
    abstract String showRole();

    public void callFromExternal() {
        System.out.println("Called from external");
    }
}
