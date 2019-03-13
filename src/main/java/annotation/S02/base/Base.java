package annotation.S02.base;

import annotation.S02.a.A;
import annotation.S02.b.B;

public class Base {

    private A a;
    private B b;

    public Base(A arg) {
        this.a = arg;
    }

    public void init() {
        System.out.println("init: " + this.toString());
    }

    public void destroy() {
        System.out.println("destroy: " + this.toString());
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
