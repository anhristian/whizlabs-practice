package edu.cnm.deepdive.testquestions;

public class ExceptionProblem {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Whizlab");
    char[] ch = new char[4];
    sb.getChars(1, 5, ch, 1);
    for (char c : ch) {
      System.out.println(c);
    }
  }
// the output is Exception ArrayOutOfBounds

}
