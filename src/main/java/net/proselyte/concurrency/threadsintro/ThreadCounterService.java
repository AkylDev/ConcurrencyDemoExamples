package net.proselyte.concurrency.threadsintro;

public class ThreadCounterService {

  public static void main(String[] args) {
    ThreadCounter tc1 = new ThreadCounter("A", 100);
    ThreadCounter tc2 = new ThreadCounter("B", 100);

    // Начинается многопоточная обработка
    tc1.start();
    tc2.start();
  }
}
