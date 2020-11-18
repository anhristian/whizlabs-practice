package edu.cnm.deepdive.prctestthree;

public class WhizFour {

  public static void main(String[] args) {
    int [] a = {1,2,3,4};

    for (int j : a){
      if (j==2) continue;
      for (int x = 0; x <3; System.out.print(x)) {
        x++;
      }
    }
  }

}
