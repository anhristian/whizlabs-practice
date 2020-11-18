package edu.cnm.deepdive.prctestthree;

public class WhizTwo {
  static int i;
  int j;
  WhizTwo(){
    j = i++;
  }

  public static void main(String[] args) {
    WhizTwo s = new WhizTwo();
    WhizTwo s1 = new WhizTwo();
    WhizTwo s2 = new WhizTwo();
    System.out.print("i= " +s.i);
    System.out.print(",j= " +s.j);
  }

}
