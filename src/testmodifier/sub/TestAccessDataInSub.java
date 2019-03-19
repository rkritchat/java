package testmodifier.sub;

import testmodifier.TestAccess;

public class TestAccessDataInSub {
    public static void main(String... args) {
        TestAccess x = new TestAccess();
        x.showWithPublicModifier();
        System.out.println(x.dataWithPublic);
    }
}
