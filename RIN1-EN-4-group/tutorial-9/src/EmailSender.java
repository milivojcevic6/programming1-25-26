public class EmailSender implements MessageSender{
    String email;

    EmailSender(String email){
        this.email = email;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message to: " + email);
        System.out.println("Message: " + message);
    }
}
