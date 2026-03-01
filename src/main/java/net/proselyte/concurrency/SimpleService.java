package net.proselyte.concurrency;

public class SimpleService {

  public void startProcess() {
    System.out.println("Starting process...");
  }

  public void sayHello() {
    System.out.println("Hello!!!");
  }

  public void sumNumbers(int num1, int num2) {
    int result = num1 + num2;
    System.out.println("Sum result: " + result);
  }

  public void finishProgram() {
    System.out.println("Finish");
    System.exit(0);
  }

}
