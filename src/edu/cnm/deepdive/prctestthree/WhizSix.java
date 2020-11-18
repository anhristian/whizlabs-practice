package edu.cnm.deepdive.prctestthree;

public class WhizSix {

  public static void main(String[] args) {
    final int i = 0;
    final int j;
    j = 2;
    int x = (int)(Math.random()*3);

    switch (x) {
      case i: {
        System.out.println("A");
      }
      case 1:
        System.out.println("B");break;
     /* case j:
        System.out.println("C");*/
    // j cannot be used as case, because it needs to be a constant, if there was
      // final int j = 2; that would work.

    }
  }

}
