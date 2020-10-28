package edu.cnm.deepdive.testquestions;

public class Whiz {

  static Integer i;

  public static void main(String[] args) {
    try {
      int x = 10;
      System.out.println(x/i.intValue());
    } catch (ArithmeticException | NullPointerException e) {
      System.out.println(e.getClass().getSimpleName());
    }
  }
}

// Here we will have a NullPointerException, because the Integer i is not assign a value so default value is Null.
