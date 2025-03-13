package myapp.custom_annotation_practice_3;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class OrderNotificationAspect {

    private final EmailService emailService;
    @Before("@annotation(orderNotificationHealthChecker)")
    public void notifyAdmin(JoinPoint joinPoint, OrderNotificationHealthChecker orderNotificationHealthChecker) {
        boolean result =  emailService.sendAnEmail("ozgurhan.45@gmail.com","Healthy Email Service","Testing Email Service");
        if (result) {
            System.out.println("orderNotificationHealthChecker service is active!");
        }else {
            System.out.println("orderNotificationHealthChecker service is not active!");
        }
    }

}
