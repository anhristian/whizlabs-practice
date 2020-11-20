package edu.cnm.deepdive.prctestfour;

public class WhizlabTwo {

  public static void main(String[] args) {
    int ints[][] = {{1,2}, {3,5}, {6,7}};
    Loop1: for (int i=0; i< ints.length;i++){
      //if (y == 3) break Loop1;  y does not compile, because it is not defined.
      for (int y = 0; y < ints[i].length; y++){
        if (y == 1) continue Loop1;
        System.out.println(ints[i][y]);
      }
    }
  }

}
