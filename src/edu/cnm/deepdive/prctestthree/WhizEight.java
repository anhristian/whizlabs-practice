package edu.cnm.deepdive.prctestthree;

public class WhizEight {

  public static void main(String[] args) {
    String str = "1Z0-808";
   str =  str.replace("80","81");
  str =   str.substring(str.indexOf("80"),str.lastIndexOf("80"));
    System.out.print(str);
  }
// the output is a exception StringIndexOutOfBounds with -1
}
