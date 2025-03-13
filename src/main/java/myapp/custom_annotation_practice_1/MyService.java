package myapp.custom_annotation_practice_1;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  @LogExecutionTime
  public void doSomething() throws InterruptedException {
    Thread.sleep(5000);
    System.out.println("Service is done");
  }
}
