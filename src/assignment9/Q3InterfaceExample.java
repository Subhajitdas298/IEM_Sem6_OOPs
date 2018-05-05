package assignment9;

public class Q3InterfaceExample {

    public static void main(String[] args) {
        DisplayClass dispobj = new DisplayClass();
        dispobj.display();
    }

}

interface DisplayInterface {

    void display();

    /* invalid as interface methods does not have body, except default method
    void show(){
        System.out.println("Show");
    }
     */
}

class DisplayClass implements DisplayInterface {

    @Override
    public void display() {
        System.out.println("Display");
    }

}
