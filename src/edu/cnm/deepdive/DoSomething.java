package edu.cnm.deepdive;

public class DoSomething {
  public void go() {
    System.out.println("A");
    try{
      stop();
    } catch (ArithmeticException e) {
      System.out.println("B");
    } finally {
      System.out.println("C");
    }
  }
  public void stop(){
    System.out.println("E");
    Object x = null;
    x.toString();
    System.out.println("F");
  }

  public static void main(String[] args) {
    new DoSomething().go();
  }

}
