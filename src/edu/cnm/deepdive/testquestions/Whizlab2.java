package edu.cnm.deepdive.testquestions;

public class Whizlab2 {

/*
public static void main(String[] args) {
  StringBuilder sb = new StringBuilder("Whizlab");
  int x = sb.capacity();
  sb.trimToSize();
  int y = sb.capacity();
  System.out.println(x+y);
}
// will be printed 30.
*/
public static void main(String[] args) {
  String s = String.join("-", "1", "1");
  System.out.println(s);
  //will be printed 1-1 because first is delimiter.
}
}
