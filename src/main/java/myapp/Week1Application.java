package myapp;

import myapp.custom_annotation_practice_1.MyService;
import myapp.custom_annotation_practice_2.SampleService1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Week1Application {

    public static void main(String[] args) {
       ApplicationContext applicationContext =  SpringApplication.run(Week1Application.class, args);
        MyService myService =  applicationContext.getBean(MyService.class);
        SampleService1 sampleService1 =  applicationContext.getBean(SampleService1.class);
       try{
      // myService.doSomething();
      System.out.println(sampleService1.processData("Hello World"));
       }catch (Exception e){
           e.printStackTrace();
       }

    }

}
