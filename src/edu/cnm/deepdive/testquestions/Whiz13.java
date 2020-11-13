package edu.cnm.deepdive.testquestions;

public class Whiz13 {

  public static void main(String[] args) {
    final int []ints = new int[3];
    int len = ints.length;
    ints[1]++;

    for (int i : ints) {
      System.out.print(i);
    }
  }

}
