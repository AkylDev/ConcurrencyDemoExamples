package net.proselyte.concurrency.virtual;

import java.util.concurrent.Executors;

public class VirtualThreadService {

  public static void main(String[] args) throws InterruptedException {

    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

      for (int i = 0; i < 100_000; i++) {
        int taskId = i;

        executor.submit(() -> {
          System.out.println("Task " + taskId +
              " running in " + Thread.currentThread());

          try {
            Thread.sleep(1000);// имитация запроса к БД
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        });
      }
    }
  }

}
