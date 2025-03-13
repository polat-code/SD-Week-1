package myapp.custom_annotation_practice_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

  @Around("@annotation(logExecutionTimeAnnotation)")
  public Object logExecutionTime(
      ProceedingJoinPoint joinPoint, LogExecutionTime logExecutionTimeAnnotation) throws Throwable {
    System.out.println("Duration Timer is started!");
    long startTime = System.currentTimeMillis();
    Object result = joinPoint.proceed();

    long duration = System.currentTimeMillis() - startTime;
    System.out.println("duration: " + duration);
    return result;
  }
}
