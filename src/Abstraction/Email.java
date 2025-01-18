package Abstraction;

public class Email {
    public void sendEmail(){
        System.out.println("Sending email...");
        Connect();
        Authenticate();
        Disconnect();

    }

    private void Disconnect() {
        System.out.println("Disconnecting...");
    }

    private void Authenticate() {
        System.out.println("Authenticating...");
    }

    private void Connect() {
        System.out.println("Connecting to server...");
    }

}
