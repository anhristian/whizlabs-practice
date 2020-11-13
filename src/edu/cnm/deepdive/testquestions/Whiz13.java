package edu.cnm.deepdive.testquestions;

public class Whiz13 {
/*
  public static void main(String[] args) {
    final int []ints = new int[3];
    int len = ints.length;
    ints[1]++;

    for (int i : ints) {
      System.out.print(i);
    }
  }*/

  static int x = 2;
  static int z;

  public static void main(String[] args) {
    System.out.println(x+z);
  }

  static {
    int x = 3;
    z = x;
  }

}
