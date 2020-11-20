package edu.cnm.deepdive.prctestfour;

public class WhizlabThree {

  public static void main(String[] args) {
    int y = 10;
    int x= 10;
    if (x != 10 && y++==1);
    if (y == 11 | ++x == 11) y+=10;
    System.out.println(y);
  }

  // so the output is y = 20 not y=21 as I may think, because at line 5
  // x != 10 is false and the part after && does not execute so y stays at 10.
  // and we have y = 10+10 = 20.

}
