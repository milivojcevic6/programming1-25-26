public class EmailSender implements MessageSender{
    String emailAddress;

    EmailSender(String emailAddress){
        this.emailAddress = emailAddress;
    }


    @Override
    public void print() {
        System.out.println("Adrress: " + emailAddress);
        System.out.println("Sent from Outlook on Ubuntu");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Text of email: " + message);
    }
}
