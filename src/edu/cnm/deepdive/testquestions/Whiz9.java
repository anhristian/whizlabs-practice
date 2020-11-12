package edu.cnm.deepdive.testquestions;

public class Whiz9 {

  static int x = 10;

  public static void main(String[] args) {
    Whiz9 wh = new Whiz9();
    wh.x = 5;
    int y = x/ wh.x;
    System.out.print("y =");
//    System.out.print(); //this line does not compile because no parameters are passed into the print method.

    System.out.println(y);

 // if line 12 is removed the output will be y = 1;
  }

}
