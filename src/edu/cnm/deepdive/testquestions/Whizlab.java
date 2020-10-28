package edu.cnm.deepdive.testquestions;

public class Whizlab {

  public static void main(String[] args) {
    try {
      System.out.println(args[0]);
    } catch (ArrayIndexOutOfBoundsException | ArithmeticException |NullPointerException e) {
      if (e instanceof ArrayIndexOutOfBoundsException) {
//        e = new ArrayIndexOutOfBoundsException("Out of bounds");
      } else if (e instanceof NullPointerException){
//        e = new NullPointerException("Null value");
        } else {
//          e = new ArithmeticException("Arithmetic exception");
        }
        System.out.println(e.getMessage());
      }
    }
  }

// the answer will be that doesn't compile because we cannot assign a value to the e in lines 10, 12, 14.