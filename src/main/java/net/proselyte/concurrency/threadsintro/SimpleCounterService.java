package net.proselyte.concurrency.threadsintro;

public class SimpleCounterService {

  public static void main(String[] args) {
    SimpleCounter sc1 = new SimpleCounter("A");
    SimpleCounter sc2 = new SimpleCounter("B");

    sc1.runCounter(15);
    sc2.runCounter(15);
  }
}
