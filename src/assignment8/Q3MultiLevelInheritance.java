package assignment8;

public class Q3MultiLevelInheritance {

    public static void main(String[] args) {
        A nA = new A();
        B nB = new B();
        C nC = new C();

        System.out.println("A public sharedToAll : " + nA.sharedToAll);
        nA.display();
        nB.display();
        nB.displaySuper();
        nC.display();
        nC.displaySuper();
    }

}

class A {
    private int personalA = 50;

    public int sharedToAll = 6;

    void display() {
        System.out.println("personalA : " + personalA);
    }
}

class B extends A {
    private int personalB = 20;

    protected int sharedFromB = 60;

    void displaySuper() {
        System.out.println("Calling super.display() from B");
        super.display();
    }

    void display() {
        System.out.println("personalB : " + personalB);
    }
}

class C extends B {
    private int personalC = 100;

    void displaySuper() {
        System.out.println("Calling super.display() from C");
        super.display();
    }

    void display() {
        System.out.println("personalC : " + personalC);
        System.out.println("sharedFromB : " + sharedFromB);
    }
}