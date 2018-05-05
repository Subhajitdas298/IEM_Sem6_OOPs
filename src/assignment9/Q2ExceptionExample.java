package assignment9;

public class Q2ExceptionExample {

    public static void main(String[] args) {
        try{
            int a = 5, b = 0;
            int c = a / b;
        }catch(ArithmeticException e){
            System.out.println("Divided by zero exception");
        }
        
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e);
        }
    }

}

class MyException extends Exception {

    @Override
    public String getMessage() {
        return "Something wrong happened";
    }

    @Override
    public String toString() {
        return "MyException : " + getMessage();
    }
}
