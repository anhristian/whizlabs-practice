package edu.cnm.deepdive.testquestions;

public class Whiz2 {

/*  static Integer i = 0;

  public static void main(String[] args) {
    try {
      int x = 10;
      System.out.println(x % i.intValue());
    } catch (NullPointerException e) {
      System.out.println("E");
    } finally {
      System.out.println("F");
    }
  }

}*/
// In this case we will have printed F, because finally is always printed and followed by
// ArithmeticException because  in line 10 will be 10/0.

  public static void main(String[] args) {
    try {
      System.out.print('A');
    } finally {
      System.out.println("Fin");
    }
  }

}