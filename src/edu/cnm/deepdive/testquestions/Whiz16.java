package edu.cnm.deepdive.testquestions;

public class Whiz16 {

  public static void main(String[] args) {
    int x = 1;
    int y = new Whiz16().change(x);
    System.out.println(x+y);

  }
  int change(int x) {
    x = 2;
    return x;
  }
// the output is 3 
}
