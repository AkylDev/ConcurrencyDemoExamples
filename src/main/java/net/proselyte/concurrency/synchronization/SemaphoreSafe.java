package net.proselyte.concurrency.synchronization;

import java.util.concurrent.Semaphore;

public class SemaphoreSafe {
  private final Semaphore betweenFirstAndSecond = new Semaphore(0);
  private final Semaphore betweenSecondAndThird = new Semaphore(0);

  public void first() {
    System.out.println("first");
    betweenFirstAndSecond.release();
  }

  public void second() {
    try {
      betweenFirstAndSecond.acquire();
      System.out.println("second");
      betweenSecondAndThird.release();
    } catch (InterruptedException e) {
      System.out.println("second interrupted");
    }
  }

  public void third() {
    try {
      betweenSecondAndThird.acquire();
      System.out.println("third");
    } catch (InterruptedException e) {
      System.out.println("third interrupted");
    }
  }
}
