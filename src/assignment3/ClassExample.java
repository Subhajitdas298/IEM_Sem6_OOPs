import java.util.Scanner;

public class ClassExample {
  public static void main(String[] args) {
    System.out.print("Enter n : ");
    int n = new Scanner(System.in).nextInt();
    
    double result = 0;

    for(int i = 1; i <= n; i++) {
      System.out.print((i == 1? "" : " + ") + "1/" + i);
      result += 1.0 / i;
    }

    System.out.println(" = " + result);
  }
}
