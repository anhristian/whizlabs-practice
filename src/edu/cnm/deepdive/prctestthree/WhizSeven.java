package edu.cnm.deepdive.prctestthree;

public class WhizSeven {

  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("aAaA");
    sb.insert(sb.lastIndexOf("A"), true);
    System.out.println(sb);

  }

}
