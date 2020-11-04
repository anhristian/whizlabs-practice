package edu.cnm.deepdive.testquestions;

public class AnimalTwo  implements Walk, Run{

  public  int getSpeed() {
    return 6;
  }

  public static void main(String[] args) {
    AnimalTwo an = new AnimalTwo();

    System.out.println(an.getSpeed());
  }
}

