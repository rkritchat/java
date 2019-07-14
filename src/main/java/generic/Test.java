package generic;

public class Test<T extends People>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String showRole() {
        return content.showRole();
    }
}
