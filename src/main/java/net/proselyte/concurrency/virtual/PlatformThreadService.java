package net.proselyte.concurrency.virtual;

public class PlatformThreadService {

  public static void main(String[] args) throws InterruptedException {

    Thread[] threads = new Thread[100_000];

    for (int i = 0; i < 100_000; i++) {
      int taskId = i;

      threads[i] = new Thread(() -> {
        System.out.println("Task " + taskId +
            " running in " + Thread.currentThread());

        try {
          Thread.sleep(1000); // имитация запроса к БД
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      });

      threads[i].start();
    }

    for (Thread thread : threads) {
      thread.join();
    }
  }
}//10 000 потоков ≈ 10 GB памяти
