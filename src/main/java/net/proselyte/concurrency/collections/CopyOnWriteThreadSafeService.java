package net.proselyte.concurrency.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteThreadSafeService {

  public static void main(String[] args) {
    List<Integer> threadSafeList = new CopyOnWriteArrayList<>();

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        threadSafeList.add(i);
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        threadSafeList.add(i);
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("threadSafeList size: " + threadSafeList.size());
  }
}//копия массива -> вносит изменение в копию -> заменяет старый массив новым
