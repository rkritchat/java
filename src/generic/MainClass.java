package generic;

public class MainClass {

    public static void main(String... args) {
        Test<Student> data = new Test<>();
        data.setContent(new Student("earl","1234"));
        System.out.println(data.showRole());
        data.getContent().callFromExternal();
    }
}

