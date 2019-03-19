package testmodifier;

public class TestDefaultModifier {
    public static void main(String... args) {
        TestAccess x = new TestAccess();
        x.showWithPublicModifier();
        x.showWithDefaultModifier();
        x.showWithProtected();
    }
}
