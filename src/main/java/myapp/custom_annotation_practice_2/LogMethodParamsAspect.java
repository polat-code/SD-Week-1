package myapp.custom_annotation_practice_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogMethodParamsAspect {

  @Before("@annotation(logMethodParams)")
  public void around(ProceedingJoinPoint joinPoint, LogMethodParams logMethodParams)
      throws Throwable {
    String name = joinPoint.getSignature().getName();
    Object[] methodsArg = joinPoint.getArgs();
    System.out.println("Method " + name + " executed with " + Arrays.toString(methodsArg));
  }
}
