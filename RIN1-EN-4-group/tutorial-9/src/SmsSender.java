public class SmsSender implements MessageSender{
    String phoneNumber;

    SmsSender(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message to: " + phoneNumber);
        System.out.println("Message: " + message);
    }
}
