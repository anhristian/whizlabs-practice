package edu.cnm.deepdive.testquestions;

public class Whiz14 {

  public static void main(String[] args) {
    new Whiz14().iterator(new int[]{10,12,13});
  }

  void iterator(int []i) {
    for (int x = 0; x < i.length; System.out.print(i[x] + " ")) x++;

  }
}
