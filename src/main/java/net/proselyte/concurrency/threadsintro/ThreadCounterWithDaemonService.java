package net.proselyte.concurrency.threadsintro;

public class ThreadCounterWithDaemonService {

  public static void main(String[] args) {
    ThreadCounterWithDaemon tc1 = new ThreadCounterWithDaemon("A", 1000, true);
    ThreadCounterWithDaemon tc2 = new ThreadCounterWithDaemon("B", 100, false);

    tc1.start();
    tc2.start();

    System.out.println("Process is finished!!!");
  }
}
