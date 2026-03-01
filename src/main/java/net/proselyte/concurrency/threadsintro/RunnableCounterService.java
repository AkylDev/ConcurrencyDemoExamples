package net.proselyte.concurrency.threadsintro;

public class RunnableCounterService {

  public static void main(String[] args) {
    RunnableCounter sc1 = new RunnableCounter("A", 100);
    RunnableCounter sc2 = new RunnableCounter("B", 100);

    Thread t1 = new Thread(sc1);
    Thread t2 = new Thread(sc2);
    t1.start();
    t2.start();
  }
}
