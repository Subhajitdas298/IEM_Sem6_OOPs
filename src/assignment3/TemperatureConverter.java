import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double result = 0;

    while(true) {
      System.out.println("Chose :-");
      System.out.println("1. C to F");
      System.out.println("2. F to C");
      System.out.println("3. Exit");
      
      System.out.print("Enter choice : ");
      int ch = input.nextInt();
      switch(ch){
        case 1:
          System.out.print("Enter temperature in C : ");
          int c = input.nextInt();
          System.out.println(c + "C = " + (9.0 * c / 5.0 + 32) + "F\n");
          break;
        case 2:
          System.out.print("Enter temperature in F : ");
          int f = input.nextInt();
          System.out.println(f + "F = " + ((f - 32.0) * 5.0 / 9.0) + "C\n");
          break;
        case 3:
          System.exit(0);
      }
    }

    
  }
}
