package structural.BridgeDesignPattern.NotificationService.dispatcher;

import structural.BridgeDesignPattern.NotificationService.message.Message;

public class SlackNotificationDispatcher implements NotificationDispatcher {

  @Override
  public boolean dispatchNotification(Message message) {
    return true;
  }

  @Override
  public NotificationChannel getNotificationChannel() {
    return NotificationChannel.SLACK;
  }
}
