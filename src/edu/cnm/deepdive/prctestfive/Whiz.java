package edu.cnm.deepdive.prctestfive;

public class Whiz {

  public static void main(String[] args) {
    final int []ints = new int[3];
    int len = ints.length;
    ints[1]++;
    for (int i : ints)
      System.out.print(i);
  }
}
