package assignment2;

public class ConstructorOverload {

    public static void main(String[] args) {
        new TestClass();
        new TestClass(1);
        new TestClass(2, 55);
    }
}

class TestClass {
    int data1, data2;

    public TestClass() {
        System.out.println("Default constructor");
    }

    public TestClass(int data1) {
        this.data1 = data1;
        System.out.println("Overloader constructor with 1 parameter");
    }

    public TestClass(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
        System.out.println("Overloader constructor with 2 parameters");
    }
}