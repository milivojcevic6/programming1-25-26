public interface MessageSender {
    void print(); // just signature because methods are abstract
    void sendMessage(String message);
    // class that implements this interface must implement all methods
}
