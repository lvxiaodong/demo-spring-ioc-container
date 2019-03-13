package xml.S01.a;

public class A {

    private String value;

    public void init() {
        System.out.println("init: " + this.toString());
    }

    public void destroy() {
        System.out.println("destroy: " + this.toString());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
