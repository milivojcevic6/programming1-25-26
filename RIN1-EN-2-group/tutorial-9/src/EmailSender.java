public class EmailSender implements MessageSender{
    String emailAddress;

    public EmailSender(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void print() {
        System.out.println("Email address: " + emailAddress);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Email text: " + message);
    }
}
