package edu.cnm.deepdive.prctestthree;

public class WhizThree {

  public static void main(String[] args) {
    new WhizThree().iterator(new int[]{10,12,13});

  }
  void iterator(int []i){
    for (int x = 0; x<i.length; System.out.println(i[x] + " "))x++;
  }
}
