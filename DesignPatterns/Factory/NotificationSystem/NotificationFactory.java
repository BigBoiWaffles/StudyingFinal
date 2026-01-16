public class NotificationFactory{
  public static Notification createNotification(String type){
    if (type == "EMAIL") { return new EmailNotification(); }
    else if (type == "SMS") { return new SMSNotification(); }
    else if (type == "PUSH") { return new PushNotification(); }
    return null;
  }
}
