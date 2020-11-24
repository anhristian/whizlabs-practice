package edu.cnm.deepdive.prctestsix;

public class WhizTwo {

  public static void main(String[] args) {
type(10);
type(10.0f);
  }

  public static void type(int x) {
    System.out.println("int");
  }

  public static void type(double x) throws Exception{
    System.out.println("double");
  }
  public static void type( byte x){
    System.out.println("byte");
  }
  public static void type(float x){
    System.out.println("float");
  }

  //the output is intfloat
}
