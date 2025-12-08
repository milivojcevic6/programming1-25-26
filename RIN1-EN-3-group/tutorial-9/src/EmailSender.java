public class EmailSender implements MessageSender{
    String emailAddress;

    EmailSender(String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public void print() {
        System.out.println("Address: " + emailAddress);
        System.out.println("Outlook for Ubuntu");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Email text: " + message);
    }
}
