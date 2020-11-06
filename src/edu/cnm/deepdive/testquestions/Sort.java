package edu.cnm.deepdive.testquestions;

import java.util.Arrays;

public class Sort {

  public static void main(String[] args) {
    String[] strings = {"N", "L", "n", "O", "S"};
    Arrays.sort(strings);

    for (String s : strings) {
      System.out.print(s);
    }
  }

}
