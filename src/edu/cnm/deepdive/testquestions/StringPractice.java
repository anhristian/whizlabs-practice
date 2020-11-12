package edu.cnm.deepdive.testquestions;

public class StringPractice {

  public static void main(String[] args) {
    char c[] = new char[] {'a', 'b', 'c'};
    String cd = "abcdef".substring(4);
    String s1 = new String(c);
    s1 += cd;
    System.out.println(s1);
  }

}
