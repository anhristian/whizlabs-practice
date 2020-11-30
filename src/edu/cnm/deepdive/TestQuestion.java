package edu.cnm.deepdive;

public class TestQuestion {

  public static void main(String[] args) {

    String a = "";
    a += 2;
    a += 'c';
    a += false;

    if (a == "2cfalse")
      System.out.println("=");
      if (a.equals("2cfalse"))
        System.out.println("equals");


      int total = 0;
      StringBuilder letters = new StringBuilder("abcdefg");
      total += letters.substring(1,2).length();
      total += letters.substring(6,6).length();
      total += letters.substring(6,5).length();
    System.out.println(total);
    }
  }
