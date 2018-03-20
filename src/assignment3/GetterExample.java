package assignment3;

public class GetterExample {
  public static void main(String[] args) {
    SampleClass obj = new SampleClass(5, 9.0, "Hello World");

    System.out.println("First Field : " + obj.getFirstField());
    System.out.println("Second Field : " + obj.getSecondField());
    System.out.println("Third Field : " + obj.getThirdField());
  }
}

class SampleClass{
  int firstField;
  double secondField;
  String thirdField;

  public SampleClass(int first, double second, String third) {
    firstField = first;
    secondField = second;
    thirdField = third;
  }

  public int getFirstField(){ return firstField; }

  public double getSecondField(){ return secondField; }

  public String getThirdField(){ return thirdField; }
}
