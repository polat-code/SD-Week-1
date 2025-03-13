package myapp;

import myapp.custom_annotation_practice_1.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Week1Application {

    public static void main(String[] args) {
       ApplicationContext applicationContext =  SpringApplication.run(Week1Application.class, args);
       MyService myService =  applicationContext.getBean(MyService.class);
       try{
           myService.doSomething();
       }catch (Exception e){
           e.printStackTrace();
       }

    }

}
