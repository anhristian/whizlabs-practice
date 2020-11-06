package edu.cnm.deepdive.testquestions;

public class ExceptionExampleTwo {

  public static void main(String[] args) {
    try {
      print();
    } catch (Exception e){}

  }

  static void print() {
    try {
      throw new NullPointerException();
    } catch (ClassCastException e) {
      System.out.println("Class Cast");
    } finally {
      System.out.println("Final");
    }
    System.out.println("OCAJP");
  }
  // this code will print Final, because at line 14 it is thrown an exception
  // but it is not caught by the catch block ClassCastException cannot caught a NullPointerEx.
  //Exception will be caught by the main method.
}
