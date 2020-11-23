package edu.cnm.deepdive.prctestsix;

public class Whiz {

  static Integer i;

  public static void main(String[] args) {
    try {
      System.out.println(i.toString());
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception e) {
      System.out.println("e");
    } finally {
      System.out.println("fin");
    }
    int i = 0;
    while (i++ <10){

    }
    System.out.println();
  }
  // te output is fin printed from finally fallowed by the exception NullPointerException.

}
