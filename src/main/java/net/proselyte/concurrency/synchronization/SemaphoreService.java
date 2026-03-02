package net.proselyte.concurrency.synchronization;

public class SemaphoreService {
  public static void main(String[] args) {
    SemaphoreSafe semaphore = new SemaphoreSafe();

    Thread t1 = new Thread(semaphore::second);
    Thread t2 = new Thread(semaphore::third);
    Thread t3 = new Thread(semaphore::first);

    t1.start();
    t2.start();
    t3.start();
  }
}
