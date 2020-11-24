package edu.cnm.deepdive.prctestsix;

public class WhizThree {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("ABCDEF");
    sb.delete(4,6);
    sb.ensureCapacity(22);
    System.out.print(sb.capacity());
    sb.ensureCapacity(23);
    System.out.print(sb.capacity());
  }

}
