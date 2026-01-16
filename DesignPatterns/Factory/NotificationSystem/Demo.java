public class Demo {
  public static void main(String[] args){
    Notification email = NotificationFactory.createNotification("EMAIL");
    email.send("Welcome to our service!");

    Notification sms = NotificationFactory.createNotification("SMS");
    sms.send("Your code is 1234");

    Notification push = NotificationFactory.createNotification("PUSH");
    push.send("New message received");
  }
}
