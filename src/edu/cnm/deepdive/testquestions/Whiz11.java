package edu.cnm.deepdive.testquestions;

public class Whiz11 {
  int x = y;
  static int y = 10;

  public static void main(String[] args) {
    System.out.print(new Whiz11().x+" ");
    System.out.println(y);
  }

  static {
    y = 15;
  }

  //the output is 15 15 because we reassigned the y to 15.
}
