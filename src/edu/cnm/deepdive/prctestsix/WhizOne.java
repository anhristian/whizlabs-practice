package edu.cnm.deepdive.prctestsix;

public class WhizOne {

  public static void main(String[] args) {
    String in = "abc";

    switch (in) {
      case "AAA":
        System.out.println(2);
      case "ABC":
        System.out.println(1);
      case "BBB":
        System.out.println(3); break;
      case "":
        System.out.println(4);
    }
  }
//no cases match with the switch statement so there won't be an output
}
