package edu.cnm.deepdive.testquestions;

public class Program {

  static {
//     x = 10; // will not compile because the declaration of x in line 10 is not static; should be declare as y is.
    y = 5;
  }

//  final int x; // not compile, is missing the static keyword.
  final static int y;

  public static void main(String[] args) {
    try{
      Program pr = new Program();
//      int c = pr.x/y;
 //     System.out.println(c);
    } catch (ArithmeticException E) {
      System.out.println("Arithmetic exception");
    }
  }

}
