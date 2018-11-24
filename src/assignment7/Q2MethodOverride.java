package assignment7;

public class Q2MethodOverride {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.test();
        Child c = new Child();
        c.test();
        Parent obj = new Child();
        obj.test();
    }
}

class Parent {
    void test() {
        System.out.println("Method at parent");
    }
}

class Child extends Parent {
    void test() {
        System.out.println("Overridden at child");
    }
}