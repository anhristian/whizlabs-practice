package edu.cnm.deepdive.prctestfour;

import java.util.function.Predicate;

public class Employee {
  int id;

  public static void main(String[] args) {
    Employee e = new Employee();
    e.id = 3;
    check(e, p -> p.id < 10);

  }

  private static void check(Employee e, Predicate<Employee> pr) {
    String result = pr.test(e) ? "match" : "not match";
    System.out.println(result);
  }

}
