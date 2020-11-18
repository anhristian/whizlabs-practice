package edu.cnm.deepdive.prctestthree;

public class WhizFive {

  public static void main(String[] args) {
    for (int x = 10; x>5; x++){
      if (x==16)x-=11;
      System.out.print(x + " ");
    }
  }
//the program will hang without ever completing.
}
