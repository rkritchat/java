package testmodifier;

public class TestAccess {

    private String dataWithPrivate = "Private";
    public String dataWithPublic = "Public";
    String dataWithDefault = "Default";
    protected String dataWithProtected = "Protected";


    private void showWithPrivateModifier() {
        System.out.println("Worked on private modifier");
    }

    void showWithDefaultModifier() {
        System.out.println("Worked on default modifier");
    }

    public void showWithPublicModifier() {
        System.out.println("Worked on public modifier");

    }

    protected void showWithProtected() {
        System.out.println("Worked on protected modifier");
    }
}
