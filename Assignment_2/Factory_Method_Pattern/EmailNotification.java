package Assignment_2.Factory_Method_Pattern;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}
