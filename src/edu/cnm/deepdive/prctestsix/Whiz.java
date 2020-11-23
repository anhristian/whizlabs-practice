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
  }
  // te output is fin printed from finally fallowed by the exception NullPointerException.

}
