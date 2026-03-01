package net.proselyte.concurrency.threadsintro;

public class ThreadCounterJoinService {

  public static void main(String[] args) {
    ThreadCounter tc1 = new ThreadCounter("A", 15);
    ThreadCounter tc2 = new ThreadCounter("B", 1000);

    tc1.start();
    tc2.start();

    try {
      tc1.join();
      tc2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Process is finished!!!");
  }
}
