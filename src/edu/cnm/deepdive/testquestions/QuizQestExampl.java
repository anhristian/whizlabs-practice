package edu.cnm.deepdive.testquestions;

import java.util.Arrays;

public class QuizQestExampl {

  static Integer I;

  public static void main(String[] args) {
  /*  int ints[][] = new int[3][];
    ints[1] = new int[]{1,2,3};
    ints[2] = new int[]{4,5};
    System.out.println(ints[1][1]);*/

    int []ints1 = new int[0b101]; //binary for is 5 and it shows that it will store 5 elements
    int len = ints1.length;

    for (int i : ints1) {
      System.out.print(i);

      String[][] strings = {{"A","Z"}, {"C", "D", "S"}, {"L"}};
      Arrays.sort(strings);
      for (String[] str : strings){
        for (String s : str) {
          System.out.println(s);

        }
      }
    }

    String s;

    try {
      s = I.toString();
    }finally {
      try {
        int i = Integer.parseInt(args[0]);
      } catch (NumberFormatException E) {
        System.out.println("NumberFormat ");
      } finally {
        System.out.println("Fin2 ");
      }
      System.out.println("Fin1 ");
    }

    Object obj = new Double(3);
    Number num = (Number) obj;
    System.out.println(num);

    /*int x = 2;
    for (int x = 0; x < 3; x++){
      System.out.println(x);
    }*/                           // will not compile because variable x is declared twice
  }

}
