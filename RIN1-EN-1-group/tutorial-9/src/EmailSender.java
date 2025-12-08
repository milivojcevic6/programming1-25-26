public class EmailSender implements MessageSender{
    String emailAddress;

    EmailSender(String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Email text: " + message);
    }

    @Override
    public void print() {
        System.out.println("Email address: " + emailAddress);
    }
}
