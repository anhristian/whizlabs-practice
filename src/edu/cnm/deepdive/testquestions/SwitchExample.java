package edu.cnm.deepdive.testquestions;

public class SwitchExample {

  public static void main(String[] args) {
    final String s = "A";
    final String c1 = "A";
    final String c2 = "B";
    final String c3 = "C";

    switch (s) {
      case c1: {
        System.out.print("A");
      }
      default: {
        System.out.print("default");
      }
      case c2: {
        System.out.print("B");
      }
      ;
      break;
      case c3: {
        System.out.print("C");
      }
      ;
    }
  }
  //the first version of the example was the variable declare at lines 6-9 were not final,
  //so the code did not compile. To use variable as case they need to be declared final.
}
