package myapp.custom_annotation_practice_3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

  private final EmailService emailService;

  @OrderNotificationHealthChecker
  public void notifySupplier() {
    boolean isSuccess =
        emailService.sendAnEmail(
            "ozgurhanpolat@std.iyte.edu.tr", "Order 1234", "Order 1234 is made!");
    if (isSuccess) {
      System.out.println("Order has been sent successfully to Supplier");
    } else {
      System.out.println("Order has not been sent to Supplier");
    }
  }
}
