public class SmsSender implements MessageSender{
   String phoneNumber;

    SmsSender(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void print() {
        System.out.println("Phone number: " + phoneNumber);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
