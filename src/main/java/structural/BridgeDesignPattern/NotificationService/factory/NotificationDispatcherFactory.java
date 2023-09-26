package structural.BridgeDesignPattern.NotificationService.factory;

import structural.BridgeDesignPattern.NotificationService.dispatcher.EmailNotificationDispatcher;
import structural.BridgeDesignPattern.NotificationService.dispatcher.NotificationChannel;
import structural.BridgeDesignPattern.NotificationService.dispatcher.NotificationDispatcher;
import structural.BridgeDesignPattern.NotificationService.dispatcher.SlackNotificationDispatcher;

public class NotificationDispatcherFactory {
  public static NotificationDispatcher getDispatcherForMessage(NotificationChannel notificationChannel) {
    NotificationDispatcher notificationDispatcher = null;

    if(NotificationChannel.EMAIL.equals(notificationChannel)) {
      notificationDispatcher = new EmailNotificationDispatcher();
    } else if(NotificationChannel.SLACK.equals(notificationChannel)) {
      notificationDispatcher = new SlackNotificationDispatcher();
    }

    return notificationDispatcher;
  }
}
