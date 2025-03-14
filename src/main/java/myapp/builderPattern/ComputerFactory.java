package myapp.builderPattern;

import myapp.custom_annotation_practice_3.OrderNotificationHealthChecker;

public class ComputerFactory {

  public Computer createComputer(
      String HDD, String RAM, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
    return new Computer.ComputerBuilder()
        .HDD(HDD)
        .RAM(RAM)
        .isGraphicsCardEnabled(isGraphicsCardEnabled)
        .isBluetoothEnabled(isBluetoothEnabled)
        .build();
  }
}
