package structural.BridgeDesignPattern.NotificationService.dispatcher;

import structural.BridgeDesignPattern.NotificationService.message.Message;

public interface NotificationDispatcher {
  boolean dispatchNotification(Message message);
  NotificationChannel getNotificationChannel();
}
