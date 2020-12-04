package edu.cnm.deepdive;

public class DoSomething {
  public int go() {
    System.out.println("A");
    int a =0;
    int b=0;
 /*   try{
      stop();
    } catch (ArithmeticException e) {
      System.out.println("B");
    } finally {
      System.out.println("C");
    }*/
    try{
      return a/b;
    } catch (RuntimeException e){
      return -1;
  /*  }catch (ArithmeticException e) {
      return 0;*/ //does not compile because this exception was already caught
    }finally {
      System.out.println("done");
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
