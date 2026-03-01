package net.proselyte.concurrency.threadsintro;

public class ThreadCounter extends Thread {

  private final String name;
  private final Integer range;

  public ThreadCounter(String name, Integer range) {
    this.name = name;
    this.range = range;
  }

  @Override
  public void run() {
    int counter = 0;
    while (counter <= range) {
      System.out.println(name + ": " + counter++);
    }
  }
}
