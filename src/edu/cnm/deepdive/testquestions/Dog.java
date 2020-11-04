package edu.cnm.deepdive.testquestions;

public class Dog extends Animal{

  public static void main(String[] args) {
    Animal dog = new Dog();
//    dog.sound();   //will not compile because the method sound si not in the super class Animal
    dog.run();
  }

  void sound() {
    System.out.print("Bark");
  }

  @Override
  public void run() {
    System.out.println("Dog runs");
  }
}
