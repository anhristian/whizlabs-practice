package edu.cnm.deepdive.testquestions;

public class DogThree extends AnimalFour {

  @Override
  public void eat()  {
    System.out.println("Dog eats");
  }

  public static void main(String[] args) {
    AnimalFour a = new DogThree();
    DogThree d = new DogThree();
    d.eat();
//    a.eat(); //not compile because we did not declared exception in the override method.
  }
}
