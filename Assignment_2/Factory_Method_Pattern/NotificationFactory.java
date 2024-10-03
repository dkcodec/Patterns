package Assignment_2.Factory_Method_Pattern;

public class NotificationFactory {
    public Notification createNotification(String type){
        if(type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        return null;
    }
}
