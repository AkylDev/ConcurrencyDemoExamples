package net.proselyte.concurrency.threadsintro;

public class SimpleCounter {

  private final String name;

  public SimpleCounter(String name) {
    this.name = name;
  }

  public void runCounter(int range) {
    int counter = 0;
    while (counter <= range) {
      System.out.println(name + ": " + counter++);
    }
  }

}
