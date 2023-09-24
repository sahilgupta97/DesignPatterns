package structural.BridgeDesignPattern.NotificationService.factory;

import structural.BridgeDesignPattern.NotificationService.dispatcher.EmailNotificationDispatcher;
import structural.BridgeDesignPattern.NotificationService.dispatcher.NotificationChannel;
import structural.BridgeDesignPattern.NotificationService.dispatcher.NotificationDispatcher;

public class NotificationDispatcherFactory {
  public static NotificationDispatcher getDispatcherForMessage(NotificationChannel notificationChannel) {
    NotificationDispatcher notificationDispatcher = null;

    if(NotificationChannel.EMAIL.equals(notificationChannel)) {
      notificationDispatcher = new EmailNotificationDispatcher();
    }

    return notificationDispatcher;
  }
}
