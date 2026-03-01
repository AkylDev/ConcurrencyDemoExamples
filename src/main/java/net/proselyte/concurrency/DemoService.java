package net.proselyte.concurrency;

public class DemoService {

  public static void main(String[] args) {
    SimpleService service = new SimpleService();

    service.startProcess();
    service.sayHello();
    service.sumNumbers(1, 2);
    service.finishProgram();
  }
}
